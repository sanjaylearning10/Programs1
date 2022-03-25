package CN21;

public class ReverseCharacterOfWordsInString {

	public static void main(String[] args) {
		
		String str="This is java world";
		String[] strArray=str.split(" ");
		
		for(int i=0;i<strArray.length;i++)
		{
			char[] charArray = strArray[i].toCharArray();
			
			for(int j=charArray.length-1;j>=0;j--)			{
				System.out.print(charArray[j]+" ");	
			}
			
			System.out.println();
		
		}
		
	
		
		
	}

}
