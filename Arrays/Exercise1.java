package arraysLab2;
import java.util.*;
public class Exercise1 
{
	public static int getSecondSmallest(int[] arr) 
	{
		 Arrays.sort(arr);
	     return arr[1];
	}
		
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the no of array elements:");
    	int n = sc.nextInt();
    	System.out.println("Enter the array");
    	int[] arr = new int[n];
    	for(int i=0;i<n;i++)
    	{
    	arr[i] = sc.nextInt();
    	}
    	System.out.println("Second Smallest: "+getSecondSmallest(arr)); 
    	sc.close();
    }
}


