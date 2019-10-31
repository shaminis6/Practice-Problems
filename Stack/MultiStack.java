package Stack;

public class MultiStack {

	int stackNum=3;
	int stackCapacity;
	int values[];
	int sizes[];
	
	MultiStack(int stackSize)
	{
		stackCapacity=stackSize;
		values=new int[stackSize * stackNum];
		sizes=new int[stackNum];
	}
	
	void push(int stackNo,int data)
	{
		if(isFull(stackNo))
		{
			return;
		}
		sizes[stackNo]++;
		values[indexOfTop(stackNo)]=data;
		
	}
	
	int pop(int stackNo)
	{
		if(isEmpty(stackNo))
			return 0;
		int element=values[indexOfTop(stackNo)];
		sizes[stackNo]--;
		return element;
		
	}
	
	boolean isFull(int stackNum)
	{
		if(sizes[stackNum]==stackCapacity)
			return true;
		return false;
	}
	
	boolean isEmpty(int stackNum)
	{
		if(sizes[stackNum]==0)
			return true;
		return false;
	}
	
	int indexOfTop(int stackNum)
	{
		int offset = stackNum * stackCapacity;
		int size=sizes[stackNum];
		return offset+size-1;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiStack stack=new MultiStack(3);
		stack.push(0,1);
		stack.push(0, 2);
		stack.push(1, 3);
		stack.push(1, 4);
		stack.push(2,5);
		
		System.out.println(stack.pop(0));
		System.out.println(stack.pop(1));
		System.out.println(stack.pop(2));

	}

}
