
import java.util.Scanner;
import java.util.Stack;

public class Reverse_stack2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Stack<Integer> inp = new Stack<>();
    
        System.out.println("Enter how many elements do you want to insert in a stack");
        int n = sc.nextInt();

        System.out.println("Enter the value of each elements - ");
        for (int i=0 ; i<n ; i++)
        {
            int data = sc.nextInt();
            inp.push(data);
        }
        reverseStack(inp);
        System.out.println("Elements of reverse stack:-");
        printStack( inp);
 
    }
    public static void printStack(Stack<Integer> inp)
    {
        while(!inp.isEmpty())
        {
            int data = inp.pop();
            System.out.print(" " + data + " ");
        }
    }
    public static void pushAtBottom(Stack<Integer> s ,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s ,data);
        s.push(top);

    }

    public static void reverseStack(Stack<Integer> inp)
    {
        if(inp.isEmpty())
        {
            return ;
        }
        int data = inp.pop();
        reverseStack(inp);
        pushAtBottom(inp , data);

    }
      
   
    
}
