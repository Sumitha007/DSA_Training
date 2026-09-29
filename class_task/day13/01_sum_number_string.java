import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] ans = s.split(" ");

        int a = Integer.parseInt(ans[0]);
        char op = ans[1].charAt(0);
        int b = Integer.parseInt(ans[2]);
        
        int result = 0;
        if (op == '+') {
            result = a + b;
        }
        else if (op == '-') {
            result = a - b;
        }
        else if (op == '*') {
            result = a * b;
        }
        else if (op == '/') {
            result = a / b;
        }
        
        System.out.println(result);
		

	}
}
