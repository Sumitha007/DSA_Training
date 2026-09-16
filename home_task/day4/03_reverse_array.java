public class Main {

    public static int[] reverseArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int[] result = reverseArray(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}