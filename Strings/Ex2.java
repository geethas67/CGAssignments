package lab3;

import java.util.Scanner;

public class Ex2 
{
	public static String getImage(String s)
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
		  sb.append(s.charAt(i));
		}
		sb.append('|');
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		return sb.toString();
	   }
	
	public static void main(String[] args)
	{
		String s = "EARTH";
		System.out.println(getImage(s));
	}
}
