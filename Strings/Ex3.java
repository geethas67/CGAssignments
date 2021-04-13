package lab3;

import java.util.Scanner;

public class Ex3 
{
   public static String alterString(String s)
   {
		StringBuffer sb = new StringBuffer();
		char[] ch = s.toCharArray();
		for(char c:ch)
	{
	if (c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U')
	    {
	      c = (char) (c + 1);
		  sb.append(c);
	    } 
	   else 
	    {
	     sb.append(c);
	    }
	}
     return sb.toString();
   }

   
   public static void main(String[] args)
   {
	  String s = "JAVA"; 
	  System.out.println(alterString(s));
   }
}
