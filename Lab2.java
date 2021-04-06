package lab1;

import java.util.Scanner;

public class Lab2 
{
  public static int calculateDifference(int n)
  {
	  int i,j,diff;
	  i = (n*(n+1) * (2*n+1))/6;
	  j = (n*(n+1))/2;
	  j = j*j;
	  diff = Math.abs(i-j);
	  return diff;  
  }
   public static void main(String[] args)
   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
	    System.out.println(calculateDifference(n));
	    sc.close();
   }
}
