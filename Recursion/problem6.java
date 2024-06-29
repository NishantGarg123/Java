//Ques:- check if a given array is sorted or not. (Using recursion)

import java.util.*;


/*class problem6
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
		int ans = sort_arr(arr,n);
		
		if(ans == 1)
		{System.out.println("Entered Array is sorted");}
		else
		{System.out.println("Entered Array is not sorted");}
		
	}

	public static int sort_arr(int arr[],int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{	
			if(arr[n-1]>arr[n-2])
			{
				return (sort_arr(arr , n-1));
			}
			else
			{
				return -1;
			}
		}

	}
}
*/


//Another way

class problem6
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
		int ans = sort_arr(arr,0);
		
		if(ans == 1)
		{System.out.println("Entered Array is sorted");}
		else
		{System.out.println("Entered Array is not sorted");}
		
	}
	
	public static int sort_arr(int arr[] , int i)
	{
		if(i == arr.length-1)
		{
			return 1;
		}
		if(arr[i]>arr[i+1])
		{
			return -1;
		}
		else
		{
			return (sort_arr(arr , i+1));
		}
	}


}