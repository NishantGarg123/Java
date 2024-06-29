//Ques:-wap to find out the 'X' ke power 'N' using the recursion.(In optimised that is o(log n))

import java.util.*;
class problem10
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of base");
		int a = sc.nextInt();
		System.out.println("Enter the value of power");
		int n = sc.nextInt();
		int result = optimizedPower(a,n);
		System.out.println("Result = "+result);
	}
	public static int optimizedPower(int a, int n)
	{
		if(n == 0)
		{
			return 1;
		}

/*		int halfPowerSq = optimizedPower(a, n/2) *optimizedPower(a,n/2);
		we can perform this work in a optimized manner
*/
		int halfPowerSq = optimizedPower(a, n/2);
		halfPowerSq =halfPowerSq * halfPowerSq;
		
		if( n % 2 != 0)
		{
			halfPowerSq = halfPowerSq *a;
		}
		
		return halfPowerSq;
	}
}
