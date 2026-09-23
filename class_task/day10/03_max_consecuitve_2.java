import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		int maxlength = 0;
		for(int i = 0; i<nums.length; i++)
		{
		    nums[i] = sc.nextInt();
		}
		int left = 0;
		int count = 0;
		for(int right = 0; right<nums.length; right++)
		{
		    if(nums[right] == 0)
		    {
		        count++;
		    }
		    while(count>1)
		    {
		        if(nums[left] == 0)
		        {
		           count--; 
		        }
		        left++;
		    }
		    maxlength = Math.max(right-left +1, maxlength);
		    
		}
		System.out.println(maxlength);

	}
}
