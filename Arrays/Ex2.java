package lab2;
import java.util.Scanner;
public class Ex2 
{
	public static String[] sortString(String[] s)
	{
	int mid = 0;
	String[] s1 = new String[s.length];
	for(int i = 0;i<s.length; i++) {
		for(int j = i+1;j < s.length; j++ ) {
			if(s[i].compareTo(s[j]) > 0) {
				String temp = s[i];
				s[i] = s[j];
				s[j] = temp;					
			}
		}
	}
	for(int i = 0;i<s.length;i++) {
		if(s[i].length() % 2 == 0 ) {
			mid = s[i].length()/2;
		}
		else {
			mid = (s[i].length() + 1)/2;
		}
		s1[i] = s[i].substring(0,mid).toUpperCase().concat(s[i].substring(mid,s[i].length()).toLowerCase());
		}
	for(String S : s1)
	{
		System.out.println(S);
	}
	return s1;
 }
	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		
	    int n = sc.nextInt();
		String[] s = new String[n];
		for(int i = 0; i<n;i++) {
			s[i] = sc.next();
		}
		sortString(s);
		sc.close();
	}
}
