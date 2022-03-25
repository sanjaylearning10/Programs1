package CN21;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TraverseInMapUsingWhileloop {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("sanjay", "priya");
		map.put("piyush", "etisha");
		map.put("ankit", "parul");
		map.put("munish", "kalpana");
		map.put("ravi", "neha");
		map.put("harsh", "manvi");

		Iterator<Entry<String, String>> mp=map.entrySet().iterator();
		
		while(mp.hasNext()) 
		{
			String key =mp.next().getKey();
			String value=map.get(key);
			System.out.println(key+" => "+value);
		}
		
		
	}

}
