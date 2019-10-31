package Stack;

import java.util.Stack;

public class SortedStack {
	
	static void sort(Stack<Integer> s1,Stack<Integer> s2)
	{
		while(!s1.isEmpty())
		{
			int tmp=s1.pop();
			while(!s2.isEmpty() && s2.peek()>tmp)
			{
				s1.push(s2.pop());
			}
			s2.push(tmp);
		}
		
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s1=new Stack<>();
		Stack<Integer> s2=new Stack<>();
		s1.push(1);
		s1.push(4);
		s1.push(2);
		sort(s1,s2);
		System.out.println(s1.pop());
		System.out.println(s1.pop());

	}

}
