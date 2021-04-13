package lab6;
import java.util.Collections;
import java.util.HashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
public class Ex1 
{
	public static List getValues(HashMap<String,Integer>m)
 {
	 List<Integer> res = new ArrayList();
	 Set keys = m.keySet();
	 Iterator itr = keys.iterator();
	 while(itr.hasNext()) {
	  String key = (String)itr.next();
	  Integer value = (Integer)m.get(key);
	 res.add(value);
 }
	 Collections.sort(res);
	 return res;
  }
	
	public static void main(String[] args)	
	{
	  HashMap<String,Integer>m = new HashMap();
	    m.put("Ram", 10);
		m.put("Sam", 30);
		m.put("Raj", 20);
		m.put("Aku", 70);
		m.put("Mann", 50);
  
	   System.out.println(getValues(m)); 
	}
}
	
	
