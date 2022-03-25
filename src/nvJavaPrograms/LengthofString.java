package nvJavaPrograms;

public class LengthofString {

	public static void main(String[] args) {
	
	String str="Hello this is my String";
		
	int len=0;
		try {	
			for(char c: str.toCharArray())
			{
				len++;	
			}
			
		}
		catch(IndexOutOfBoundsException e) {	
			
		}
		finally 
		{
			System.out.println(len);
		}
		
	}

}
