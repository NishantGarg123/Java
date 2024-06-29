//Ques:-Print Factorial of a number n.
import java.util.*;

class problem3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to find out the factorial");
		int n = sc.nextInt();
		int ans = fact(n);
		System.out.println("ANS = "+ ans);
	}
	
	public static int fact(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		else
		{
			return (n * fact(n-1));
		}
	}
}