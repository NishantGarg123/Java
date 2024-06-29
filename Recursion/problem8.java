//Ques:-wap to find out the last occurence of the element using the recursion.

import java.util.*;
class problem8
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
		int ind = Last_occurance(arr , key , 0);
		if( ind ==-1 )
		{
			System.out.println("Element not present in array");			
		}
		else		
		{
		System.out.println("Key is at index = " + ind);
		}
	}
	public static int Last_occurance(int arr[] , int key , int i)
	{
		if( i == arr.length-1)
		{
			return -1;
		}
		int isfound = Last_occurance( arr , key ,i+1);
		if(isfound == -1 && arr[i] == key)
		{
			return i;
		}
		
		return isfound;
	}
}