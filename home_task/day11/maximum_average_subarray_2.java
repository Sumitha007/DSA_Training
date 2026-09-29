import java.util.*;

class Codechef {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        double maxAverage = -Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            for (int j = i + k; j <= n; j++) {

                int sum = prefix[j] - prefix[i];

                double average = (double) sum / (j - i);

                maxAverage = Math.max(maxAverage, average);
            }
        }

        System.out.println(maxAverage);
    }
}