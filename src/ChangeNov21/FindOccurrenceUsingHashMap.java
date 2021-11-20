package ChangeNov21;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindOccurrenceUsingHashMap {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		String str = "All is Well";

		Map<Character, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			if (hashMap.containsKey(str.charAt(i)))

				hashMap.put(str.charAt(i), hashMap.get(str.charAt(i)) + 1);

			else
				hashMap.put(str.charAt(i), 1);
		}

		for (Map.Entry<Character, Integer> mp : hashMap.entrySet()) {
			System.out.println(mp.getKey() + ":" + "   " + mp.getValue());
		}

	}

}
