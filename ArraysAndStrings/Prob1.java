package ArraysAndStrings;

import java.util.Scanner;

public class Prob1 {
	
	       
	public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String input=sc.next();
        int count=0;
        char a[]=input.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            int number = Character.getNumericValue(a[i]);
            if(number !=6)
            {
            count++;
            }
            else
            {
                count++;
                while(number==6)
                {
                    i++;
                    if(i>0 && i<a.length)
                    {
                    number = Character.getNumericValue(a[i]);
                    }
                }
            }
        }
        System.out.println(count);

    }

}
