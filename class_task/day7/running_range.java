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

        int[] range = new int[arr.length];
        for(int i = 0; i<arr.length; i++)
        {
            range[i] = max[i] - min[i];
        }
        System.out.println(Arrays.toString(range));
    }
}