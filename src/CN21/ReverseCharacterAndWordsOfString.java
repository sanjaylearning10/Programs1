package CN21;

public class ReverseCharacterAndWordsOfString {

	public static void main(String[] args) {
		
		String str="This is java world";
		char[] charArray=str.toCharArray();
		
		for(int i=0;i<charArray.length/2;i++)
		{
			char temp=charArray[i];
			charArray[i]=charArray[charArray.length-i-1];
					charArray[charArray.length-i-1]=temp;
		}
		
	for(int i=0;i<charArray.length;i++)
	{
		System.out.println(charArray[i]);
	}
		
		
	}

}
