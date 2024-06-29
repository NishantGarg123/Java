//Ques-Print numbers from n to 1 (Decreasing order) using Recursion.

import java.util.*;
class problem1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value to print the numbers in decreasing order:-");
		int n = sc.nextInt();
		System.out.println("in decreasing oredr");
		desc(n);
	}
	
	public static void desc(int n)
	{
		if(n==1)	
		{
			System.out.print(n +" ");
			return;
		}
		else
		{
			System.out.print(n + " ");;
			desc(n-1);
		}
	}
}