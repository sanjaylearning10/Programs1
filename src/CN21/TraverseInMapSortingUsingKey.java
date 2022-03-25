package CN21;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TraverseInMapSortingUsingKey {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("sanjay", "priya");
		map.put("piyush", "etisha");
		map.put("ankit", "parul");
		map.put("munish", "kalpana");
		map.put("ravi", "neha");
		map.put("harsh", "manvi");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Collections.reverseOrder())).forEach((k)->System.out.println(k.getKey()+"=> "+k.getValue()));
		
		System.out.println("***************************");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach((k)->System.out.println(k.getKey()+"=> "+k.getValue()));
		
		System.out.println("***************************");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEach((k)->System.out.println(k.getKey()+"=> "+k.getValue()));
	
		System.out.println("***************************");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach((k)->System.out.println(k.getKey()+"=> "+k.getValue()));
		
	}

}
