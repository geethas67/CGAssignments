package lab3;

import java.util.Scanner;

public class Ex5 
{
	public static int charCount(String s)
	{
		int charcount = 0;
		int wordcount = 0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!= ' ') {
				charcount+=1;
			}
			else {
				wordcount+=1;
			}
		}
		System.out.println("No of Characters:"+charcount);
		System.out.println("No of words:"+(wordcount+1));
		return 0;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		charCount(s);
		sc.close();
	}
}
