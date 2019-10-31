package ArraysAndStrings;

import java.util.Scanner;

public class LargestSub0s {
	
	static int maxLen(int[] arr) 
    {
         // Your code here
         int hash[]=new int[2];
         for(int i=0;i<arr.length;i++)
         {
             hash[arr[i]]++;
         }
         System.out.println("hash values");
         System.out.println(hash[0]);
         System.out.println(hash[1]);
         if(hash[0]==hash[1])
         return arr.length;
         else
         {
             if(hash[0]<hash[1])
             {
                return 2 * hash[0];
             }
            else
            {
                return 2 * hash[1];
            }
         }
         
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int p=0;p<arr.length;p++)
		{
			arr[p]=sc.nextInt();
		}
		System.out.println(maxLen(arr));
		

	}

}
