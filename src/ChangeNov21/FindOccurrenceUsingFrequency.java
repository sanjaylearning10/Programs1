package ChangeNov21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindOccurrenceUsingFrequency {

	public static void main(String[] args) {
		String str = "All is Well";
		char[] strArray=str.toCharArray();
		
		List<Character> list= new ArrayList<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			list.add(str.charAt(i));
		}
		
		Set<Character> uniqueCharacter= new HashSet<Character>(list);
		
		for(Object c: uniqueCharacter)
		{
			System.out.println(c+": => "+Collections.frequency(list, c));
		}
		
		
	}

}
