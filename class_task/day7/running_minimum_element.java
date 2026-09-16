import java.util.Arrays;
class Main{
    public static void main(String[] args)
    {
        int[] arr = {2, 5, 1, 8, 3, 6, 4, 7};
        int[] min = new int[arr.length];
        int minvalue = arr[0];
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]<minvalue)
            {
                minvalue = arr[i];
            }
            min[i] = minvalue;
        }
        System.out.println(Arrays.toString(min));
    }
}