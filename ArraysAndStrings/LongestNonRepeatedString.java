package ArraysAndStrings;

public class LongestNonRepeatedString {
	static int getString(String s) {
		int maxlength=0;
        int sublength=0;
        int j=0;
        while(j<s.length())
        {
            sublength=0;
            int count[]=new int[1000];
            if(count[s.charAt(j)] == 0)
            {
                int k=j;
                while(k<s.length() && count[s.charAt(k)] ==0)
                {
                count[s.charAt(k)]++;
                sublength++;
                System.out.println("sublength " +sublength);
                k++;
                }
                if(sublength>maxlength)
                {
                    maxlength=sublength;
                }
            }
            j++;
        }
        if(sublength>maxlength)
        {
            maxlength=sublength;
        }
        if(maxlength==0 && s.length() >0)
        {
            maxlength=1;
        }
        return maxlength;
    }
	
	public static void main(String args[])
	{
		System.out.println(getString("abcabcbb"));
	}

}
