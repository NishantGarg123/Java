//Ques:- Print Nth Fibonacci number.(using Recursion)

import java.util.*;

class problem5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value of N for Nth Fibonacci nuber");
		int n = sc.nextInt();
		int ans = fib(n);
		System.out.println(ans);
	}

	public static int fib (int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n == 1 || n==2 )
		{
			return 1;
		}
		else
		{
			return ( fib(n-1) + fib(n-2));
		}
	}
}