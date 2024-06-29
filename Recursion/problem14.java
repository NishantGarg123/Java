//Ques:- print all posible binary string that does not contain consecutive 1's
import java.util.*;
class problem14
{
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n");
		int  n = sc.nextInt ();
		printBinaryString(n , 0 , "");
		
	}
	public static void printBinaryString( int n ,int lastPlace , String str )
	{
		//base case
		if( n ==0 )
		{
			System.out.println(str);
			return;
		}
		
		//Recursive case
		printBinaryString( n-1 , 0 , str +"0");
		if(lastPlace == 0)
		{
			printBinaryString(n-1 , 1 , str +"1");
		}
		
	}
}
