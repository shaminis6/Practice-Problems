package Stack;

import java.util.ArrayList;
import java.util.List;

public class SetOfStacks {
	
	List<StackLinkedList> stacks=new ArrayList<>();
	
	void push(int data)
	{
		StackLinkedList lastStack = getLastStack();
		if(lastStack != null)
		{
			lastStack.push(data);
		}
		else
		{
			StackLinkedList stack=new StackLinkedList();
			stack.push(data);
			stacks.add(stack);
		}
	}
	
	int pop()
	{
		StackLinkedList last=getLastStack();
		int v=(int) last.pop().data;
		if(last.top==null)
			stacks.remove(stacks.size()-1);
		return v;
	}
	
	StackLinkedList getLastStack()
	{
		return stacks.get(stacks.size()-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
