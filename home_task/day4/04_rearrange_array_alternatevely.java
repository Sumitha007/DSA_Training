public class Main {

    public static int[] rearrange(int[] arr) {

        java.util.Arrays.sort(arr);

        int n = arr.length;
        int[] temp = new int[n];

        int left = 0;
        int right = n - 1;

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                temp[i] = arr[right];
                right--;
            } else {
                temp[i] = arr[left];
                left++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] result = rearrange(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}