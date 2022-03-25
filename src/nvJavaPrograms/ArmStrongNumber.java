package nvJavaPrograms;

public class ArmStrongNumber {

	public static void main(String[] args) {
		System.out.println(checkArmstrongNumber(407));
		
	}

	public static boolean checkArmstrongNumber(int num)
	{
		boolean flag=false;
		int temp=0;
		int originalNum=num;
		int sum=0;
		
		while(num!=0)
		{
			temp=num%10;
			num=num/10;
			sum=sum+temp*temp*temp;
			if(sum==originalNum)
			{
				flag=true;
			}
			
		}
	
		
		return flag;
		
	}
}
