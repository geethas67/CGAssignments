package arraysLab2;
import java.util.*;
public class Exercise4 
{
     public static int[] modifyArray(int[] arr)
	{
		int j=0;
		int[] res = new int[arr.length];
		Arrays.sort(arr);
	     for (int i=0; i < arr.length-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                arr[j] = arr[i];  
	                j++;
	            }  
	        }  
	        arr[j] = arr[arr.length-1];
	    	for(int i=j;i>=0;i--) {
	    		System.out.print(arr[i]);
	    	}
	    return res;
	    }
			
	public static void main(String[] args)
	{
		int arr[] = {1,3,2,4,9,4,6,4,2,8,3};
		modifyArray(arr);
	}
}


	