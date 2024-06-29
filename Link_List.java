class L_creation
{
	public static class Node 
	{
		int data;
		Node next;
		public Node(int data)
		{	
			this.data = data;
			this.next = null;
		}
	}

	public static Node head;
	public static Node tail;
	public static int size;


	public static void main(String args[])
	{
		L_creation ll = new L_creation();

		ll.printLinkedList();

		ll.addFirst(1);		
		ll.addFirst(2);
		ll.addLast(3);

		ll.printLinkedList();
		System.out.println("After searching 20");
		int ind = ll.itrSearch(20);
		System.out.println("index of 20 = "+ind);
		
		
		ll.printLinkedList();
		System.out.println("The size = "+ size);
	}


//1.ADD the element in linked list at the front
	public void addFirst(int data)
	{
		//step1-create a new node
		Node newnode = new Node(data);
		size++;
		
		if(head == null)
		{
			head = tail = newnode;
			return;
		}
		
		//step2- newnode.next = head
		newnode.next = head;

		//step3- haed = newnode
		head = newnode;

	}	

//2.ADD the element in linked list at the LAST
	public void addLast(int data)
	{
		//step1-create a node
		Node newnode = new Node(data);
		size++;
		if(head == null)
		{
			head = tail = newnode;
			return;
		}
		
		//step2- tail.next = newnode
		tail.next = newnode;
		
		//step3- tail =newnode.next
		tail =newnode;
	}

//3.printing the Linked list
	public void printLinkedList()
	{	
		if( head == null)
		{
			System.out.println("Linked List is Empty");
			return;
		}
		
		Node temp = head;
		while( temp != null)
		{
			System.out.print(temp.data +"-->");
			temp = temp.next;
		}

		System.out.println("null");
	}

//4. Add NODE in the middle(given index ) in the Linked List.that taking two parameter->1.index,2.data.
	public void addMiddle(int index , int data)
	{
	

		if( index ==0)
		{	
			addFirst(data);
		}
		//step1- creat the new node
		Node newnode = new Node(data);
		size++;

		Node temp = head;
		int i =0;

		while( i < index-1)
		{
			temp = temp.next;
			if(temp == null)
			{
				System.out.println("Linked List does not contain index "+index);
				return;
			}
			i++;
		}

		//logic to add the element at the position of add that contain by the temp.
		Node hold_add = temp.next;
		temp.next=newnode;
		newnode.next = hold_add;
		
	}

//5.Remove the node from the Linked List from the first position.that return the deleted element
	public int removeFirst()
	{
		if(size == 0)
		{
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		}

		if(size == 1)
		{
			int delete_element = head.data;
			head = tail = null;
			size =0;
			return delete_element;
		}
		int delete_element = head.data;
		head = head.next;
		size--;
		return delete_element;
	}

//6.Remove the node from the Linked List from the Last position.that return the deleted element
	public int removeLast()
	{
		if(size == 0)
		{
			System.out.println("LL is empty");
			return Integer.MIN_VALUE;
		}
		
		else if(size == 1)
		{
			int delete_element = tail.data;
			size =0;
			head = tail = null;
			return delete_element ;
		}

		
		//Now trverse the list to find out the address of the one before last node.
		int delete_element = tail.data;
		Node temp = head;

		while( temp.next.next != null)    //or-> for(i=1 ; i< size-1 ; i++){ temp = temp.next; }
		{
			temp = temp.next;
		}
		
		temp.next = null;
		tail = temp;
		size--;
		return delete_element;
	}

//7.Search a key (Using the iteration)with in the Linked List and return the position where it is found . if not found then return -1.
	public int itrSearch(int key)
	{
		Node temp = head;
		int i=0;
		while( temp != null)
		{
			if( temp.data == key)
			{
				return i;	
			}
			temp = temp.next;
			i++;
		}
		return -1;
	}

//7.Search a key (Using the iteration)with in the Linked List and return the position where it is found . if not found then return -1.
	public int recSearch(Node temp ,int key)
	{
		if( head == null)
		{
			return -1;
		}
		if( head.data == key)
		{
			return 0;
		}
		int ind = recSearch(temp.next , key);
		if(ind == -1)
		{
			return -1;
		}
		return ind+1;
	}

//8.Reverse the Linked list using the (Iterative approach).
	public void reverse()
	{
		
	}

}
































