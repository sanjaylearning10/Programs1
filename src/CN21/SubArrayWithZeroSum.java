package CN21;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		int[] array = new int[]  { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };
		
		for(int i=0;i<array.length;i++)
			
		{
			int sum=0;
			for(int j=i;j<array.length;j++)
			{
				sum=sum+array[j];
				if(sum==0)
				{
					System.out.println("SubArray of Arrays is "+i+" "+ j);
				}
						
			}
			
		}
	}

}
