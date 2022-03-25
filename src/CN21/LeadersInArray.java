package CN21;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

	public static void main(String[] args) {
		int[] array= {14,9,11,7,8,5,3};
		int lastElement= array[array.length-1];
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(lastElement);
				
		int temp = 0;
		for(int i=array.length-2;i>=0;i--)
		{
			if(array[i]>lastElement)
			{
				temp=array[i];
				lastElement=array[i];
				list.add(temp);
			}
			
		}
		System.out.println("Leaders of Arrays are "+list);

	}

}
