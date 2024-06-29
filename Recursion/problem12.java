// Ques Remove Duplicates from the Given string (Constraint -> char in a string are a-z in small case only).


import java.util.*;
class problem12
{
	
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the string");
		String n = sc.next();
		removeDuplicate(n , 0 ,new StringBuilder("") ,new boolean[26]);
		
	}
	public static void removeDuplicate(String str ,int i , StringBuilder nonDuplicate ,boolean map[] )
	{
		if(i>=str.length())
		{
			System.out.println("Final String = "+ nonDuplicate );
			 return;
		}

		char mychar = str.charAt(i);

		if(map[mychar-'a'] == true)
		{
			removeDuplicate( str ,i+1 ,nonDuplicate ,map );
		}else
		{

			map[mychar-'a'] = true;
			removeDuplicate( str ,i+1 ,  nonDuplicate.append(mychar) ,map );
		}
		
		
		
	}
}