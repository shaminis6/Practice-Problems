package ArraysAndStrings;

public class UrlifyString {
	
	public static String replaceSpaces(char str[],int len)
	{
		//count spaces
		int count=0;
		for(int i=0;i<len;i++)
		{
			if(str[i]==' ')
				count++;
		}
		
		int index= len + (count * 3);

		if(len<str.length)
		{
			str[len]='\0';
		}
		for(int j=len-1;j>=0;j--)
		{
			System.out.println("j value is " +j);
			if(str[j] == ' ')
			{
				str[index-1] = '0';
				str[index-2] = '2';
				str[index-3] = '%';
				index=index-3;
				System.out.println( "str value is " +str[j]);
			}
			else
			{
				System.out.println("index value is" +index);
				str[index-1]=str[j];
				index--;
				System.out.println("Str1 value is " +str[j]);
			}
			
		}
		return str.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Mr X        ";
		char str1[]= str.toCharArray();
		System.out.println(replaceSpaces(str1, 4));
	}

}
