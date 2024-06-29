//Ques:-wap to find out the 'X' ke power 'N' using the recursion.

import java.util.*;
class problem9
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the value of base");
		int X = sc.nextInt();
		System.out.println("Enter the value of power");
		int N= sc.nextInt();

		int ans = X_power_N(X , N);
		System.out.println("The value = " + ans);
	}
	
	public static int X_power_N(int base , int power)
	{
		if(power == 1)
		{
			return base;
		}
		else
		{
			return (base * X_power_N(base , power-1));
		}
	}
}