package CN21;

public class MoveAllZeroElementtoEnd1 {

	public static void main(String[] args) {
		int [] array = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		int j=0;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				array[j++]=array[i];
			}
		}
		
		for( int i=j;i<array.length;i++)
		{
			array[i]=0;
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
