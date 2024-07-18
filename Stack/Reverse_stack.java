//Reverse the stack using the another stack (This solution consume O(n) memory).

import java.util.Scanner;
import java.util.Stack;

public class Reverse_stack {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Stack<Integer> inp = new Stack<>();
        Stack<Integer> out = new Stack<>();

        System.out.println("Enter how many elements do you want to insert in a stack");
        int n = sc.nextInt();

        System.out.println("Enter the value of each elements - ");
        for (int i=0 ; i<n ; i++)
        {
            int data = sc.nextInt();
            inp.push(data);
        }

        System.out.println("Entered "+n+"elements are");

        for (int i=0 ; i<n ; i++)
        {
            int data = inp.pop();
            out.push(data);
          System.out.print(" "+data+"" );
        }
        System.out.println("");
        System.out.println("After Reverse the stack Elements are:-");

        for (int i=0 ; i<n ; i++)
        {
            int data = out.pop();
            System.out.print(" "+data+"" );
        }  

    }
}
