public class Main {

    public static int[] reorderArr(int[] arr, int[] indArr) {

        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[indArr[i]] = arr[i];
        }

        return arr1;
    }

    public static void main(String[] args) {

        int[] arr = {12, 3, 54, 55, 65};
        int[] indArr = {1, 3, 4, 2, 0};

        int[] result = reorderArr(arr, indArr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}