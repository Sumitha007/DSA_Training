import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;

        int minDiff = Integer.MAX_VALUE;
        int a = 0, b = 0, sum = 0;

        while (left < right) {
            int currentSum = arr[left] + arr[right];
            int diff = Math.abs(currentSum - target);

            if (diff < minDiff) {
                minDiff = diff;
                a = arr[left];
                b = arr[right];
                sum = currentSum;
            }

            if (currentSum < target) {
                left++;
            } else if (currentSum > target) {
                right--;
            } else {
                break;
            }
        }

        System.out.println("Pair: " + a + " " + b);
    }
}