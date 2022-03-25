package nvJavaPrograms;

public class CheckForPrimeNumber {

	public static void main(String[] args) {
			System.out.println(checkPrimeNumber(19));
	}
	
	public static boolean checkPrimeNumber(int num)
	{
		//boolean flag=true;
		
		if(num<=1)
			return false;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		return true; 	
	}

}
