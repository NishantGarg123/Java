
import java.util.*;

// Problem -> WAP in java to reverse a string using the Stack.

  class Reverse_str {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String str = sc.nextLine();
        str = reverseString(str);
        System.out.println("new reverse string = "+ str );

    }

    public static String reverseString(String str){

        int len = str.length();
        Stack<Character> s = new Stack<>();
        for(int i=0 ; i<len ; i++)
        {
            
            s.push(str.charAt(i));
        }
        str = "";
        while(!s.isEmpty())
        {
            str = str + s.pop();
        }
        return str;

    }
}
