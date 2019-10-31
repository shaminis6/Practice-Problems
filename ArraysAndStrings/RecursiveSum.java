package ArraysAndStrings;

public class RecursiveSum {
	
	static int getFibo(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return getFibo(n-1)+getFibo(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getFibo(4));
	}

}
