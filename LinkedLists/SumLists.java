package LinkedLists;

import java.io.ObjectInputStream;

public class SumLists {
	
	Node head1;
	Node head2;
	Node result;
	
	public  void insert(int data)
	{
		Node newNode = new Node(data);
			newNode.next=head1;
			head1=newNode;

	}
	
	public  void insertAnother(int data)
	{
		Node newNode = new Node(data);
			newNode.next=head2;
			head2=newNode;

	}
	
	
	void print()
	{
		Node current=head1;
		while(current!= null)
		{
			System.out.print(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}
	void printAnother()
	{
		Node current=head2;
		while(current!= null)
		{
			System.out.print(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}
	
	void printResult()
	{
		Node current=result;
		while(current!= null)
		{
			System.out.print(current.data + " ");
			current=current.next;
		}
		System.out.println();
	}
	
	void sumOflists()
	{
		int carry=0;
		while(head1!=null || head2!=null)
		{
			
			
			int sum = (head1!=null?head1.data:0) + (head2!=null?head2.data:0) + carry;
			
			carry= sum>9?1:0;
			sum=sum%10;
			Node newNode = new Node(sum);
			if(result==null)
			{
				System.out.println("come here1");
				result = newNode;
			}
			else
			{
				Node temp=result;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=newNode;
				
			}
			
			if(head1!=null)
			{
				head1=head1.next;
			}
			if(head2!=null)
			{
				head2=head2.next;
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumLists obj = new SumLists();
		obj.insert(9);
		obj.insert(6);
		obj.insert(1);
		obj.insert(7);
		obj.insertAnother(2);
		obj.insertAnother(9);
		obj.insertAnother(5);
		obj.sumOflists();
		obj.printResult();
		

	}

}
