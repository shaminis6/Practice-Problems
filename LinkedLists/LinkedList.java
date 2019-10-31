package LinkedLists;

public class LinkedList {
	 Node head;
	
	public  void insert(int data)
	{
		Node newNode = new Node(data);
System.out.println("new nod is" +newNode.data);
			newNode.next=head;
			head=newNode;

	}
	
	public  void insertAtEnd(int data)
	{
		Node newNode=new Node(data);
			Node current=head;
			while(current.next != null)
			{
				current=current.next;
				
			}
			current.next=newNode;
		
	}
	
	 void deleteNode(int data)
	{
		if(head.data==data)
		{
			head=head.next;
		}
		else
		{
			Node current=head;
			Node prev=null;
			while(current.next!=null && current.data!=data)
			{
				prev=current;
				current=current.next;
			}
			prev.next=current.next;
		}
	}
	
	void printElements()
	{
		Node current=head;
		while(current!= null)
		{
			System.out.print(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.insert(2);
		list.printElements();
		list.insertAtEnd(3);
		list.printElements();
		list.deleteNode(3);
		list.printElements();
		

	}

}
