
import java.util.ArrayList;

public class imp_arrls
{
     static class stack
     {
        static ArrayList<Integer> list = new ArrayList<>();

     // isEmpty Method
        public static boolean isEmpty()
        {
           return list.size() == 0;
        }

     //Push Method
        public static void push( int data)
        {
          list.add(data);
        }

     //POP Method
        public static int pop()
        {
         if(isEmpty() == true)
         {
            return -1;
         }
          int top = list.get(list.size()-1);
          list.remove(list.size()-1);
          return top;
        }

     //Peek Method
        public static int peek()
        {
         if(isEmpty() == true)
         {
            return -1;
         }
          return list.get(list.size()-1);
        }
     }

     public static void main(String[] args) 
     {
          stack s = new stack();

          s.push(2);s.push(3);s.push(4);s.push(5);
          System.out.println(s.peek());

          while(!s.isEmpty())
          {
               System.out.println(s.peek());
               s.pop();
          }
          
          
     }
}