package lab6;
import java.util.HashMap;
import java.util.Map;

public class Ex3
{
	public static Map getSquares(int[] arr)
	{
		Map<Integer, Integer> res = new HashMap<>();
		for(int x:arr)
		{
			if(!res.containsKey(x))
			{
				res.put(x,x*x);
			}
			else {
				continue;
			}
		}
		return res;
	}
	
	
	public static void main(String[] args)	
	{
	   int[] arr = {1,2,3,4,5,6,7,8,9};
	   System.out.println(getSquares(arr));   
	}

}
