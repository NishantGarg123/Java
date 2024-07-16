
import java.util.*;
public class pushAtBottom {
    
    public static void pushBottom(Stack<Integer> s ,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s ,data);
        s.push(top);

    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        System.out.println("How many elements do tou wants to push in stack initialy");
        int n = sc.nextInt();
        System.out.println("Enter the elements to be  push in the stack");
        for(int i=1 ;i<=n ;i++)
        {
            int data = sc.nextInt();
            s.push(data);
        }
        System.out.println("Enter the element which you want to push at the bottom of existing stack ");
        int data = sc.nextInt();
        pushBottom(s, data);
        System.out.println("After Push at Bottom ->");
        while( !s.isEmpty())
        {
            int key = s.pop();
            System.out.println(key);
        }
    }
}
