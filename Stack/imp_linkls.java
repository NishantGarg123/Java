

public class imp_linkls
{
    //create the Node structure
    static class Node
    {
        int data;
        Node next;

         Node( int data) 
         {

            this.data = data;
            this.next =null;
         }
    }

    static class stack
    {
        static Node head = null;

        //isEmpty Method
        public static boolean isEmpty()
        {
           return head ==null;
        }
        //Pop Method 
        public static int pop()
        {
            if(head == null)
            {
                return -1;
            }
           int data = head.data;
           head = head.next;
           return data;
        }
        //Push Method
        public static void push( int data)
        {
            Node n1 = new Node(data);
            if(isEmpty())
            {
                head = n1;
                return;
            }
            n1.next = head;
            head = n1;
        }
        //Peek MEthod
        public static int peek()
        {
            if(head ==null)
            {
                return -1;
            }
            return head.data;

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