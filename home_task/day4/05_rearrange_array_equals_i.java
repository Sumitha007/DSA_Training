public class Main {

    public static int[] modifyArray(int[] arr) {

        int[] arr1 = new int[arr.length];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = -1;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] == i) {
                    arr1[i] = i;
                    break;
                }
            }
        }

        return arr1;
    }

    public static void main(String[] args) {

        int[] arr = {-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};

        int[] result = modifyArray(arr);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}