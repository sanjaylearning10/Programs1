package CN21;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		
		String str="This is java world";
		String[] strArray=str.split(" ");
		
		for(int i=0;i<strArray.length/2;i++)
		{
			String temp=strArray[i];
			strArray[i]=strArray[strArray.length-i-1];
			strArray[strArray.length-i-1]=temp;
			
			
		}
		
		for(int i=0;i<strArray.length;i++)
		{
			System.out.print(strArray[i]+" ");
		}
	}

}
