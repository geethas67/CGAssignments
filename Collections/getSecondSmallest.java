package lab6;

import java.util.*;
public class getSecondSmallest 
{
	public static int getSecondSmallest(int[] a) 
	{
		List<Integer> list = Arrays.asList(a);
		
		 Collections.sort(list);
		 int elem = list.get(1);
	     return elem;
	}
		
    public static void main(String[] args)
    {
        Integer[] a = {1,2,5,6,3,2};
        System.out.println("Second Smallest: "+getSecondSmallest(a));
    }
}
