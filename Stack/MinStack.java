package Stack;

public class MinStack {
	
	MinNode top;
	int minValue=-1;
	
	void push(int data)
	{
		if(minValue==-1)
		{
			minValue=data;
		}
		else if(data<minValue)
		{
			minValue=data;
		}
		int minimum=minValue;
		MinNode newNode = new MinNode(data, minimum);
		if(top==null)
		{
			top=newNode;
		}
		else
		{
			newNode.next=top;
			top=newNode;
		}
	}
	
	int pop()
	{
		MinNode ele=top;
		top=top.next;
		return (int) ele.data;
	}
	
	int getMin()
	{
		return (int) top.min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack stack=new MinStack();
		stack.push(2);
		stack.push(4);
		stack.push(3);
		stack.push(1);
		System.out.println(stack.getMin());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.getMin());

	}

}
