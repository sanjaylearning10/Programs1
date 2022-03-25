package CN21;

public class SortBinaryArray {

	public static void main(String[] args) {
		int [] array = { 1, 0, 1, 0, 1, 0, 0, 1 ,1};
		
		int count=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)
				count++;
		}
		
		for(int i=0;i<=count;i++)
		{
			array[i]=0;
		}
		
		for(int i=count;i<array.length;i++)
		{	
			array[i]=1;
			
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}

	}

}
