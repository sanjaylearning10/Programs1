package nvJavaPrograms;

public class PalindromNumber {
	
	public static void main(String...args)
	{
		int num=121;
		int originalnum=num;
		
		int temp=0;
		while(num!=0)
		{
			temp=temp*10+num%10;
			num=num/10;
			
		}
		
		if(originalnum==temp)
			System.out.println("True");
		else
			System.out.println("false");
	}

}
