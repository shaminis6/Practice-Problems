package ArraysAndStrings;

public class StringCompression {
	
	public static String compressString(String str)
	{
		StringBuilder resultantStr = new StringBuilder();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			
			char value = str.charAt(i);
			
			while((i+1)<str.length() && str.charAt(i+1) == value)
			{
				i++;
				count++;
			}
			resultantStr = resultantStr.append(value).append(count);
			count=1;
		}
		String result=resultantStr.toString();
		return (result.length() < str.length() ? result : str);
	}
	
	public static void main(String args[])
	{
		System.out.println(compressString("aabccccaaa"));
	}

}
