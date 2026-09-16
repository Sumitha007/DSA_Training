public class Main {

    public static int[] arrange(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] / n;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] result = arrange(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}