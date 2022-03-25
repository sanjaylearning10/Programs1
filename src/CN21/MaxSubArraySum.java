package CN21;

public class MaxSubArraySum {

	public static void main(String[] args) 
	{
		int[] array = new int[] {-3, 1, -2, 5, 0, 3, 2, -4, 6};	
		System.out.println(findMaxSum(array));
	}
	
	public static int findMaxSum(int[] array)
	{
		
		int MAX_SUM=Integer.MIN_VALUE;
		int curentSum=0;
		
		for(int i=0;i<array.length;i++)
		{
			curentSum=curentSum+array[i];
			
			if(curentSum>MAX_SUM)
			{
				MAX_SUM=curentSum;
			}
			
			if(curentSum<0)
			{	
				curentSum=0;
			}
		}
		
		return MAX_SUM;
	}

}
