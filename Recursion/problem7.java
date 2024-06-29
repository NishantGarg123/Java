// Ques:-wap to find out index of first occurance of element.(using recursion)
import java.util.*;

class problem7
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter how many number of elements in the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of array");

		for(int i=0 ; i<n ; i++)
		{
			arr[i] = sc.nextInt();	
		}
		System.out.println("Enter the element to find first occurance");
		int key = sc.nextInt();
		int start_ind = 0;
		int ind = index_arr(arr , key , start_ind);
		if( ind ==-1 )
		{
			System.out.println("Element not present in array");			
		}
		else		
		{
		System.out.println("Key is at index = " + ind);
		}
	}

	public static int index_arr(int arr[] , int key , int start_ind)
	{
		if( start_ind == arr.length-1)
		{
			return -1;
		}
		if(arr[start_ind] == key)
		{	return start_ind; 
		}
		lse
		{	return (index_arr(arr, key , start_ind+1));
		}
	}e
}