import java.util.*;

class Solution {
    static ArrayList<Integer> maxSum(int[] arr, int k) {

        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;

        int maxSum = Integer.MIN_VALUE;
        int maxDiff = Integer.MIN_VALUE;

        int ans1 = -1;
        int ans2 = -1;

        while(left < right) {

            int sum = arr[left] + arr[right];

            if(sum < k) {

                int diff = Math.abs(arr[left] - arr[right]);

                if(sum > maxSum) {
                    maxSum = sum;
                    maxDiff = diff;

                    ans1 = arr[left];
                    ans2 = arr[right];
                }
                else if(sum == maxSum && diff > maxDiff) {
                    maxDiff = diff;

                    ans1 = arr[left];
                    ans2 = arr[right];
                }

                left++;
            }
            else {
                right--;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        result.add(ans1);
        result.add(ans2);

        return result;
    }
}