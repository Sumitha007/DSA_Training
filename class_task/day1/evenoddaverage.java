class Main{
    public static void main(String[] args){
        int[] arr = {3, 5, 1, 8, 2};
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                evenSum += arr[i];
                evenCount++;
            } else {
                oddSum += arr[i];
                oddCount++;
            }
        }

        double evenAverage = (evenCount > 0) ? (double)evenSum / evenCount : 0;
        double oddAverage = (oddCount > 0) ? (double)oddSum / oddCount : 0;

        System.out.println("Even Average: " + evenAverage);
        System.out.println("Odd Average: " + oddAverage);
    }
}