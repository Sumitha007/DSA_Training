class Main{
    public static void main(String[] args)
    {
        int[] arr = {3, 5, 1, 8, 2};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != firstLargest){
                secondLargest = arr[i];
            }
        }

        System.out.println("First Largest: " + firstLargest);
        System.out.println("Second Largest: " + secondLargest);
    }
}