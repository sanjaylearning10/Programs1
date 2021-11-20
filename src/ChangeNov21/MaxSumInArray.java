package ChangeNov21;

public class MaxSumInArray {

	public static void main(String[] args) {
		int[] array = new int[] {22,123,125,41,-75,38,27,211};
		int sum=201;
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				int temp=array[i]+array[j];
				
				if(temp>sum)
				{
					System.out.println("Largest sum is "+ temp +" and related index are "+ array[i] +" "+ array[j]);
				}
			
			
		}
		}
	

	}

}
