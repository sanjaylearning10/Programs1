package CN21;

import java.util.HashMap;
import java.util.Map;

public class TraverseInMapUsingForEach {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("sanjay", "priya");
		map.put("piyush", "etisha");
		map.put("ankit", "parul");
		map.put("munish", "kalpana");
		map.put("ravi", "neha");
		map.put("harsh", "manvi");

		map.forEach((k,v)->System.out.println(k+" "+v ));
		
		
	}

}
