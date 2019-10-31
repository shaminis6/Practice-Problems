package Stack;

import java.util.Stack;

public class QueueUsingTwoStacks {
	Stack<Integer> s1=new Stack<>();
	Stack<Integer> s2=new Stack<>();
	
	void add(int value)
	{
		s1.add(value);
	}
	
	int pop()
	{
		shiftStacks();
		return s2.pop();
	}
	
	void shiftStacks()
	{
		if(s2.isEmpty())
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingTwoStacks obj = new QueueUsingTwoStacks();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		System.out.println(obj.pop());
		

	}

}
