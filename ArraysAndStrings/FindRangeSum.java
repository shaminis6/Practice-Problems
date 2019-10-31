package ArraysAndStrings;

public class FindRangeSum {
	
	static int findRangeSum(int arr[],int i,int j)
	{
		int prefix[]=new int[arr.length];
		prefix[0]=arr[0];
		for(int k=1;k<arr.length;k++)
		{
			prefix[k]=arr[k]+prefix[k-1];
		}
		if(i==0)
			return arr[j];
		else
			return prefix[j]-prefix[i-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5};
		System.out.println(findRangeSum(arr,1,2));
		System.out.println(findRangeSum(arr, 2, 4));

	}

}
