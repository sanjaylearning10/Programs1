package CN21;

public class MoveAllZeroElementtoEnd {

	public static void main(String[] args) {
		int [] array = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		
		int [] newArray =new int[array.length];
		int low=0;
		int high=newArray.length-1;
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==0)	
			{
				
				newArray[high]=0;
				high--;
			}
			else
			{
				newArray[low]=array[i];
			low++;
			}
		}
		
		for(int i=0;i<newArray.length;i++)
		{
			array[i]=newArray[i];
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
