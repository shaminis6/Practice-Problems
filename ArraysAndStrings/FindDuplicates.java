package ArraysAndStrings;

public class FindDuplicates {
	
	public static boolean isUnique(String str)
	{
		if(str.length()>128)
		{
			return false;
		}
		boolean arr[]=new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			if(arr[str.charAt(i)] == true)
				return false;
			else
			arr[str.charAt(i)]=true;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isUnique("abcdea"));

	}

}
