package ArraysAndStrings;

public class StringFunc {
	
	public static boolean canEditFunc(String str1,String str2)
	{
		boolean letters[]=new boolean[128];
		for(int i=0;i<str1.length();i++)
		{
			letters[str1.charAt(i)]=true;
		}
		int unmatchCount=0;
		for(int j=0;j<str2.length();j++)
		{
			char value=str2.charAt(j);
			if(!letters[value])
				unmatchCount++;
			if(!letters[value] && unmatchCount>1)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canEditFunc("beek", "bale"));

	}

}
