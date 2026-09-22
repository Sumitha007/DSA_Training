import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int[n];
		for(int i = 0; i<n; i++)
		{
		    nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		for(int i = 0; i<=n-k; i++)
		{
		    for(int j = i; j<i+k; j++)
		    {
		        System.out.print(nums[j] + " ");
		    }
		    System.out.println();
        }
    }
}