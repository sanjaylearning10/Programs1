package nvJavaPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DuplicateElementsList {

	public static void main(String[] args) {
		List<String> ll= new ArrayList<>();
		List<String> ll1= new Stack<>();
		
		
		
		ll.add("Bangalore");
		ll.add("Mumbai");
		ll.add("Delhi");
		ll.add("Bangalore");
		ll.add("Chennai");
		
		for(int i=0;i<ll.size();i++)
		{
			for(int j=i+1;j<ll.size();j++)
			{
				if(ll.get(i).equals(ll.get(j)))
				{
					System.out.println(ll.get(i));
				}
				
			}
		}
		
		
		
	}

}
