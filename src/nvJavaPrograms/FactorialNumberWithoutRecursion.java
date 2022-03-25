package nvJavaPrograms;

public class FactorialNumberWithoutRecursion {

	public static void main(String[] args) {
		
		System.out.println(fact(5));

	}
	
	public static int fact(int num)
	{
		int fact = 1;
		
		if(num==1 || num==0)
			fact=1;
		else
		{
			for(int i=2;i<=num;i++)
			{
				fact=fact*i;
			}
		}
		
		return fact;
		
	}

}
