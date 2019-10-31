package ArraysAndStrings;

public class MatchingStrings {
	
	public static boolean areMatching(String str1,String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		int[] letters = new int[128];
		for(int i=0;i<str1.length();i++)
		{
			char val = str1.charAt(i);
			letters[val]++;
			
		}
		for(int j=0;j<str2.length();j++)
		{
			char val2=str2.charAt(j);
			letters[val2]++;
			if(letters[val2]<0)
				return false;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(areMatching("abc", "ABC"));
	}

}
