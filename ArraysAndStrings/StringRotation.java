package ArraysAndStrings;

public class StringRotation {
	
	public static boolean isRotation(String str1,String str2)
	{
		if(str1.length() != str2.length())
			return false;
		else
		{
		String result = str1 + str1;
		return result.contains(str2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isRotation("cardboard", "boardcar"));

	}

}
