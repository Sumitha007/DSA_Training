class Solution {
    public int[] prefixAvg(int[] arr) {
        int[] ans = new int[arr.length];
        int avg = 0;
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum += arr[i];
            avg = sum/(i+1);
            ans[i] = avg;
        }
        return ans;
    }
}