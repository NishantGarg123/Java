//8.Remove the  elements in the Starting of the  list.

import java.util.Scanner;

public class problem8{

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
            problem8 ll  = new problem8();
            System.out.println("Enter how many elements do you wants to add in the initial link list");
            int n = sc.nextInt();
            for(int i=1; i<=n ;i++)
            {
                System.out.println("enter the value of "+ i +" element");
                int value = sc.nextInt();
                add_element(value);
            }
            System.out.print("This is a existing List");
            ll.printlist();
           System.out.println("------------------------------------------------------------");
            System.out.println("enter 1 if you wants to delete the first node");
            System.out.println("enter 0 if you do not wants to delete the first node");
            int flag =sc.nextInt();
            if(flag ==1)
            {
                delElement_First();            
            }
            
            ll.printlist();
    
        }
      //===================================================================================================>

      //===================================================================================================>
        // logic to delete the elements using from the Ending of the list.
        public static void delElement_First()
        {
            if(head == null)
            {
                System.out.println("List is empty");
            }
            else if(head.link == null)
            {
                head = null;
            }
            else
            {
                head = head.link;
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
        
    