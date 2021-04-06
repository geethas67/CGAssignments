package flowControlLab1;

import java.util.Scanner;

public class Lab3 
{
	public static boolean checkNumber(int n)
	{
		String s =Integer.toString(n);
		char[] ch = s.toCharArray();
		for(int i =0;i<ch.length-1;i++)
		{
			if(ch[i]<ch[i+1]) 
			{
			return true;
			}
		}
			return false;
	}
	
	public static void main(String[] args)
	{   
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n:");
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
		sc.close();
	}
	
}
