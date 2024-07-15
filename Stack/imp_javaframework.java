
// Implementation of Stack using Java collection Frame work

import java.util.*;

public class imp_javaframework 
{

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(5);s.push(4);s.push(3);s.push(2);s.push(1);
        while (!s.isEmpty()) 
        { 
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
