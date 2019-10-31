package Stack;

public class QueueLinkedList<T> {
	
	Node<T> front;
	Node<T> rear;
	
	void add(int data)
	{
		Node newNode = new Node(data);
		if(rear==null)
		{
			rear=newNode;
		}
		else
		{
		rear.next=newNode;
		rear=newNode;
		}
		
		if(front==null)
		{
			front=rear;
		}
	}
	
	Node remove()
	{
		if(front==null)
		{
			return null;
		}
		else
		{
			Node item = front;
			front=front.next;
			if(front==rear)
				rear=null;
			return item;
		}
	}
	
	Node peek()
	{
		return front;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueLinkedList<Integer> list=new QueueLinkedList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list.remove().data);
		System.out.println(list.remove().data);

	}

}
