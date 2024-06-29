//print Sum of First n natural numbers.(using Recursion).

import java.util.*;

class problem4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		Natural Nat = new Natural();
		System.out.println(" Enter the value to find the sum of n natural number");
		int n = sc.nextInt();
		int ans = Nat.nat_num(n);	
		System.out.println(ans);
	}
}

class Natural
{
	public int nat_num(int n)
	{
		if(n ==1)
		{
			return 1;
		}
		else
		{
			return (n + nat_num(n-1));
		}
	}

}