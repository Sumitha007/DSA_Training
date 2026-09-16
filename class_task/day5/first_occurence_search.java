public class Main {

    public static int[] firstOcc(int[] arr, int ele) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == ele) {

                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }

                int[] result = new int[arr.length - 1];

                for (int j = 0; j < result.length; j++) {
                    result[j] = arr[j];
                }

                return result;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 6, 7, 8, 9, 10};
        int ele = 6;

        int[] result = firstOcc(arr, ele);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}