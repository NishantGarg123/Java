
import java.util.Stack;

//In this we are going to solve the problem of stock span problem.
public class Stock_Span {

    public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100};
        int span[] = new int[stock.length];

        stockSpan(stock , span);

        for(int i=0 ; i<stock.length ; i++)
        {
            System.out.println(span[i]);
        }

    }

    public static void stockSpan( int stock[] , int span[])
    {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1 ; i<stock.length ; i++)   
        {
            while(!s.isEmpty() && (stock[i]>stock[s.peek()]))
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                span[i] = i+1;
            }
            else
            {
                int prevHigh = s.peek();
                span[i] = i-prevHigh;
            }
            s.push(i);
        }
    }
    
}
