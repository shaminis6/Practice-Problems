package ArraysAndStrings;

public class JumpProblem {
	
	static boolean canJump(int arr[])
	{
		int length=arr.length-1;
		int i=0;
		while(i<arr.length)
		{
			int leaps=i+arr[i];
			System.out.println("leaps and i value "+leaps + " " + i);
			length=length-arr[i];
			System.out.println("length is "+length);
			if(arr[i]==0)
				break;
			i=leaps;
		}
		if(length<=0)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,5,0,0};
		System.out.println(canJump(arr));

	}

}
