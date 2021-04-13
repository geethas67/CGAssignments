package lab6;
import java.util.*;
public class countChars 
{
	public static Map<Character,Integer>countChar(char[] ch)
	{
		HashMap<Character,Integer>map = new HashMap<Character,Integer>();
		for(int i = 0; i<ch.length;i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i],1);
			}
			else {
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		return map;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter the character array");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] ch = s.toCharArray();
		System.out.println(countChar(ch));;
		sc.close();
	}
}
