package nvJavaPrograms;

public class FindPercentageOfLetters {

	public static void main(String[] args) {
		
		String str="This123!@#$%^";
		int digit=0;
		int alphabet=0;
		int lowerCase=0;
		int upperCase=0;
		int other=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
				digit++;
			
			
			  else if(Character.isAlphabetic(str.charAt(i))) 
				  alphabet++;
			 
			else if(Character.isLowerCase(str.charAt(i)))
				lowerCase++;
			
			else if(Character.isUpperCase(str.charAt(i)))
				upperCase++;
			else
				other++;	
		}
		System.out.println(digit +" " +alphabet+" "+ lowerCase +" "+ upperCase +" "+ other);
		System.out.println("***********************************");
		System.out.println(digit*100/str.length()+"\n "+alphabet*100/str.length()+"\n"+
		lowerCase*100/str.length()+"\n"+upperCase*100/str.length()+other*100/str.length());
		
	}

}
