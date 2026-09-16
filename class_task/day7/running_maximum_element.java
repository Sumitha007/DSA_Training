class Main{
    public static void main(String[] args)
    {
        int[] arr = {2, 5, 1, 8, 3, 6, 4, 7};
        int[] max = new int[arr.length];
        int maxvalue = arr[0];
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>maxvalue)
            {
                maxvalue = arr[i];
            }
            max[i] = maxvalue;
        }
        System.out.println(Arrays.toString(max));
    }
}