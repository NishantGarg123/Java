//Ques:- Friend pairing problem.

import java.util.*;
class problem13
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n that is the number of friends");
		int n = sc.nextInt();
		int ans = friendsPairing(n);
		System.out.println("Result = "+ ans);
	}
	public static int friendsPairing(int n)
	{
		if(n==1 || n==2)
		{
			return n;
		}
	/*	//choice	
		//1.single
		int fnm1 = friendsPairing(n-1);
		
		//2.pair
		int fnm2 = friendsPairing(n-2);
		int pair = fnm2 *(n-1);
		int totalWays = fnm1 + pair;
		return totalWays;
	*/

		return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
	}
}