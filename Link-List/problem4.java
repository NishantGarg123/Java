//Ques- write java code to add the element in the specified position of link list using the index value.
import java.util.Scanner;

public class problem4{

    //===================================================================================================>
        //class that define the structure of the link list
        public static class  Node
        {
            int data;
            Node link; 
        }
    //===================================================================================================>
    
    //===================================================================================================>
        //Global variable that store the address of the 1st node of list
        public static Node head;
    //===================================================================================================>
    
    
    //===================================================================================================>
        //main method 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            problem4 ll  = new problem4();
            System.out.println("Enter how many elements do you wants to add in the initial link list");
            int n = sc.nextInt();
            for(int i=1; i<=n ;i++)
            {
                System.out.println("enter the value of "+ i +" element");
                int value = sc.nextInt();
                add_element(value);
            }
            System.out.println("This is a existing List");
            ll.printlist();
            System.out.println("Now enter the element which you want to add in this list");
            int key = sc.nextInt();
            System.out.println("Enter the index value where you wants to add the element");
           int position = sc.nextInt();
            add_UsingIndex(key , position);
            ll.printlist();
    
        }
      //===================================================================================================>

      //===================================================================================================>
        // logic to add the elements at the specified position using the index value
        public static void add_UsingIndex( int key, int position)
        {
            Node n1 = new Node();
            n1.data = key;
            n1.link =null;

            Node ptr = head;
            Node prev_ptr = null;
            
            int flag =0;
            while(flag != position)
            {
                flag++;
                prev_ptr = ptr;
                ptr = ptr.link;
            }
            n1.link = ptr;
            prev_ptr.link = n1;
            ptr = n1;
            if(position == 0)
            {
                head = ptr;
            }   
        }   
      //===================================================================================================>
    
    
    //===================================================================================================>
        // Logic to add element in the last of the link list    
        public  static void add_element(int key)
        {
            Node n1 = new Node();
            n1.data = key;
            if(head == null)
            {
                head = n1;
                return;
            }
            Node temp = head;
            while(temp.link != null)
            {
                temp = temp.link;
            }
            temp.link = n1;
            n1.link = null;
        }
    //===================================================================================================>
    
    //===================================================================================================>
        //Logic to print the all elements of the link list
        public void printlist()
        {
            if(head == null)
            {
                System.out.println("List is empty");
                return;
            }
            Node temp = head;
            System.out.println("List elements are-");
                while(temp != null)
                {
                    System.out.print(temp.data);
                    System.out.print("-->");
    
                    temp = temp.link;
                }
         
            System.out.println("NULL");
        }
    
    }
    //===================================================================================================>
        
    