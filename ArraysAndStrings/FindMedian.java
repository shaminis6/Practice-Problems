package ArraysAndStrings;

public class FindMedian {
	
	static int findMedian(int arr1[],int arr2[])
	{
		int result=0;
		if(arr1.length>arr2.length)
		{
			findMedian(arr2,arr1);
		}
		int x=arr1.length;
		int y=arr2.length;
		
		int low=0;
		int high=arr1.length;
		while(low<=high)
		{
			int partitionX=(low+high)/2;
			int partitionY=((x+y+1)/2)-partitionX;
			
			int maxleftX= partitionX==0 ? Integer.MIN_VALUE : arr1[partitionX-1];
			int maxleftY= partitionY==0? Integer.MIN_VALUE: arr2[partitionY-1];
			
			int minrightX= partitionX==0 ? Integer.MAX_VALUE : arr1[partitionX];
			int minrightY=partitionY==0 ? Integer.MAX_VALUE: arr2[partitionY];
			
			if(maxleftX<=minrightY && maxleftY<=minrightX)
			{
				if((x+y) %2 ==0)
				{
					result= Math.max(maxleftX , maxleftY) + Math.min(minrightX,minrightY) / 2;
				}
				else
				{
					result= Math.max(maxleftX,maxleftY);
				}
			}
			else if(maxleftX > minrightY)
			{
				high=partitionX-1;
			}
			else
			{
				low=partitionX+1;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]={1,3,8,9,15};
		int arr2[]={7,11,18,19,21,25};
		System.out.println(findMedian(arr1,arr2));

	}

}
