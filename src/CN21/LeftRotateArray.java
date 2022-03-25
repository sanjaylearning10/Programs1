package CN21;

public class LeftRotateArray {

	public static void main(String[] args) {
		
		int[] array =new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		rotateArray(array,2);
	}
	
	public static void rotateArray(int[] array, int n)
	{
	
		int[] temp=new int[n];
		
		for(int i=0;i<temp.length;i++)
		{
			temp[i]=array[i];
		}
		
		for(int i=0;i<array.length-n;i++)
		{
			array[i]=array[i+n];
		}
		
		for(int i=0;i<temp.length;i++)
		{
			array[array.length-n+i]=temp[i];
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);	
		}
			
		
	}

}
