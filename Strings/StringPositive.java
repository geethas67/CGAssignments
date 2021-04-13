package lab3;

import java.util.Scanner;

public class StringPositive {
   static boolean stringPositive(String s)
   {
	   char[] ch = s.toCharArray();
	   for(int i=0; i<ch.length-1;i++) {
		   for(int j=i+1;j<ch.length;j++) {
			   if(ch[i]>ch[j]) {
				   return false;
			   }
		   }
	   }
	   return true;
   }
    
   public static void main(String[] args)
   {
	   System.out.println("Enter the String");
	   Scanner sc = new Scanner(System.in);
	   String s = sc.next();
	   System.out.println(stringPositive(s));
   }
}
