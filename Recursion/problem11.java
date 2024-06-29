/* Ques :- Tiling problem

Given a "2xn" floor and tiles of size "2x1",count the number of ways to tile the given board using the "2x1" tiles.
(A tile can either be placed horizontaly or vertically .) 

*/
import java.util.*;
class problem11
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value of n that is length of the tile");
		int n = sc.nextInt();
		int result = tiles(n);
		System.out.println("Result = "+ result);
	}
	public static int tiles (int n)
	{
		if(n ==0 || n==1)
		{
			return 1;
		}
		
	/*	//choice = vertical 
		int fnm1 = tiles(n-1);
		
		//choice = horizontal
		int fnm2 = tiles(n-2);

		int totalWay = fnm1 + fnm2 ;		
		return totalWay;
	*/

		return tiles(n-1) + tiles(n-2);
	}
}