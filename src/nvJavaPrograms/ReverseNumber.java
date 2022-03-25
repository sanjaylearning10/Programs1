package nvJavaPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 123456789;
		
		int temp=0;
		
		while(num!=0)
		{
			temp=(temp*10)+ (num%10);
			num=num/10;
		}
		
		System.out.println("Reverse of number is "+ temp);

	}

}
