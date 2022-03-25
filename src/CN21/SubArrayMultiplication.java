package CN21;

public class SubArrayMultiplication {

	public static void main(String[] args) {
		int[] array= {123,456,789,1011,1213};
		
		for(int i=0;i<array.length;i++)
		{
			int product=1;
			
			while(array[i]!=0)
			{
				 product=product*(array[i]%10);
				 array[i]=array[i]/10;
			}
			array[i]=product;
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}

}
