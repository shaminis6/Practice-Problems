package LinkedLists;

public class RemoveDupes {
	
	Node head;
	Node head1;
	
	public  void insert(int data)
	{
		Node newNode = new Node(data);
			newNode.next=head;
			head=newNode;

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
	
	void removeDupes()
	{
		boolean isExists[]=new boolean[1000];
		
		Node current=head;
		Node prev=null;
		
		while(current!=null)
		{
			if(isExists[current.data])
			{
				prev.next=current.next;
			}
			else
			{
				isExists[current.data]=true;
			}
			prev=current;
			current=current.next;
		}
		
	}
	
	int getKthElement(int k)
	{
		Node p1=head;
		Node p2=head;
		
		for(int i=0;i<k;i++)
		{
			if(p1==null)
				return 0;
			p1=p1.next;
		}
		while(p1!=null)
		{
			p1=p1.next;
			p2=p2.next;
		}
		return p2.data;
	}
	
	void deleteMiddle(Node middle)
	{
		Node current=middle.next;
		middle.data=current.data;
		middle.next=current.next;
	}
	
	void partitionList(int partition)
	{
		Node current=head;
		while(current != null)
		{
				Node newNode = new Node(current.data);
				if(current.data<partition)
				{
					newNode.next=head1;
					head1=newNode;
				}
				else
				{
					if(head1!=null)
					{
					Node temp=head1;
					while(temp!=null)
					{
						temp=temp.next;
					}
					temp.next=newNode;
					}
					else
					{
						head1=newNode;
					}
				}
			
			current=current.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDupes obj = new RemoveDupes();
		obj.insert(1);
		obj.insert(2);
		obj.insert(1);
		obj.insert(3);
		obj.removeDupes();
		obj.printElements();
		System.out.println(obj.getKthElement(2));
		obj.partitionList(3);
		obj.print();
		
		
		

	}

}
