public class Main {

    public static int[] firstLastOccurrence(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        int first = -1;
        int last = -1;

        while (left <= right) {

            if (arr[left] == target && first == -1) {
                first = left;
            }

            if (arr[right] == target && last == -1) {
                last = right;
            }

            if (first != -1 && last != -1) {
                break;
            }

            if (first == -1) {
                left++;
            }

            if (last == -1) {
                right--;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 2, 5};
        int target = 2;

        int[] result = firstLastOccurrence(arr, target);

        System.out.println("First occurrence: " + result[0]);
        System.out.println("Last occurrence: " + result[1]);
    }
}