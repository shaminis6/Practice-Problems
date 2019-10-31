package LinkedLists;

public class PalindromeCheck {
	 Node head;
	 Node head1;
		
	public  void insert(int data)
	{
		Node newNode = new Node(data);
			newNode.next=head;
			head=newNode;

	}
	
	public  void insertAnother(int data)
	{
		Node newNode = new Node(data);
			newNode.next=head1;
			head1=newNode;

	}
	
	public void insertInCircular()
	{
		Node current=head;
		Node prev=null;
		while(current.next!=null)
		{
			prev=current;
			current=current.next;
		}
		current.next=prev;
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
	
	boolean isPalindrome()
	{
		int count[]=new int[1000];
		Node current=head;
		while(current != null)
		{
			count[current.data]++;
			current=current.next;
		}
		Node temp=head;
		boolean isOddCount=false;
		while(temp!=null)
		{
			if(count[temp.data] %2 ==1 && isOddCount)
			{
				return false;
			}
			if(count[temp.data]==1)
			{
				isOddCount=true;
			}
			temp=temp.next;
		}
		return true;		
	}
	
	Node findIntersection()
	{
		Node current=head;
		int len1=0;
		Node prev=null;
		while(current != null)
		{
			len1++;
			prev=current;
			current=current.next;
		}
		Node temp=head1;
		int len2=0;
		Node prev1=null;
		while(temp!=null)
		{
			len2++;
			prev1=temp;
			temp=temp.next;
		}
		//check if last nodes match
		if(prev != prev1)
		{
			return null;
		}
		int diff = findDiff(len1,len2);
		boolean firstlist = (len1>len2)?true:false;
		Node p1=head,p2=head1;
		if(firstlist)
		{
			for(int i=0;i<diff;i++)
			{
				p1=p1.next;
			}
		}
		else
		{
			for(int j=0;j<diff;j++)
			{
				p2=p2.next;
			}
		}
		Node result=null;
		while(p1!=null && p2!=null)
		{
			if(p1.data!=p2.data)
			{
				p1=p1.next;
				p2=p2.next;
			}
			else
			{
				result=p1;
				result.data=p1.data;
				result.next=null;
				break;
			}
			
		}
		return result;
		
		
	}
	
	int findDiff(int len1,int len2)
	{
		int diff=0;
		if(len1>len2)
		{
			diff=len1-len2;
		}
		else
		{
			diff=len2-len1;
		}
		return diff;
	}
	
	void insertAtEnd(int data)
	{
		Node current=head;
		Node newNode=null;
		while(current != null)
		{
			if(current.data==data)
			{
			newNode=current;
			newNode.next=head1;
			head1=newNode;
			}
			current=current.next;
		}
	}
	
	Node hasLoop()
	{
		Node fastPtr=head;
		Node slowPtr=head;
		while(fastPtr!=null && fastPtr.next!=null)
		{
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			if(slowPtr==fastPtr)
			{
				break;
			}
		}
		
		// No loop
		if (fastPtr == null || fastPtr.next == null) {
			return null;
		}
		slowPtr=head;
		System.out.println("fast ptr is " +fastPtr.data);
		System.out.println("slow ptr is "+slowPtr.data);
		while(slowPtr!=fastPtr)
		{
			slowPtr=slowPtr.next;
			fastPtr=fastPtr.next;
		}
		return fastPtr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeCheck list=new PalindromeCheck();
		list.insert(7);
		list.insert(6);
		list.insert(3);
		list.insert(2);
		list.insert(1);
		list.insertInCircular();
		list.insertAtEnd(7);
		list.insertAtEnd(6);
		list.insertAnother(5);
		list.insertAnother(4);
		list.printElements();
		System.out.println(list.isPalindrome());
		System.out.println(list.findIntersection().data);
		System.out.println(list.hasLoop().data);

	}

}
