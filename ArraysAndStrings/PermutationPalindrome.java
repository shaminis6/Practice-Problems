package ArraysAndStrings;

public class PermutationPalindrome {
	
	public static boolean isPalindrome(String str)
	{
		int letters[]=new int[Character.getNumericValue('z') - Character.getNumericValue('a') +1];
		for(int i=0;i<str.length();i++)
		{
			
			char value=str.charAt(i);
			if(value != ' ')
			{
			letters[Character.getNumericValue(value) - Character.getNumericValue('a')]++;
			}
		}
		boolean foundOdd = false;
		for(int j=0;j<letters.length;j++)
		{	

			if(letters[j]>0)
			{
			if(((letters[j] % 2) != 0) && foundOdd)
				return false;
			if(letters[j]==1)
				foundOdd=true;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("Tact Coat"));

	}

}
