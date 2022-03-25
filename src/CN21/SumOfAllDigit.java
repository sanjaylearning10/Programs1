package CN21;

public class SumOfAllDigit {

	public static void main(String[] args) {
		int num=123456789;
		
		int temp=0;
		while(num!=0)
		{
			
			int div= num%10;
			temp=temp+div;
			num=num/10;
			
		}
		
		System.out.println("Sum of All digits is =>"+temp);

	}

}
