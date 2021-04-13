package lab6;
import java.util.*;
public class reverseSort 
{
	public static void main(String[] args)
	{
		System.out.println("Enter the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] num = new Integer[n];
		for(int i = 0; i<n; i++) {
			num[i] = sc.nextInt();
		}
		List<Integer> list = Arrays.asList(num);
		
		Collections.reverse(list);
	//	System.out.println("Enter the array");
		System.out.println("Reversed Array: ");
		System.out.println(list+"  ");
		Collections.sort(list);
		System.out.println("\nSorted Array:");
		System.out.println(list+"  ");
	}
}
