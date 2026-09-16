class Main{
    public static void main(String[] args)
    {
        int[] arr = {3, 5, 1, 8, 2};
        int k = 2;
        int n = arr.length;
        k = k % n; 

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

    }
    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}