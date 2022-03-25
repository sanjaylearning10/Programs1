package CN21;

public class MaximumProductOfArray {

	public static void main(String[] args) {
		int[] array = {-10, -3, 5, 6, -2};
		int result= Integer.MIN_VALUE;
		
		for(int i=0;i<array.length-1;i++)
		{
			int product;
			
				product=array[i]*array[i+1];
				if(product>=result)
				{
					result=product;
					System.out.println("pairs are "+i +" and "+ (i+1)+" which are "+array[i]+" "+array[i+1]);
				}
			
		}
		
		System.out.println("Maximum product is =>"+result);
	}

}
