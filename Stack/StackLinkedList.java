package Stack;

public class StackLinkedList<T> {
	Node<T> top;
	
	void push(T data)
	{
		Node newNode = new Node(data);
		newNode.next=top;
		top=newNode;		
	}
	
	Node pop()
	{
		if(top==null)
		{
			return null;
		}
		Node temp=top;
		top=top.next;
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackLinkedList<Integer> list=new StackLinkedList<Integer>();
		list.push(1);
		list.push(2);
		System.out.println(list.pop().data);

	}

}
