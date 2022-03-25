package CN21;

public class Anagram {

	public static void main(String[] args) {
	
		String str1="Hitler Woman";
		String str2= "Mother in law";
		
		System.out.println(checkAnagram(str1,str2));

	}
	
	public static boolean checkAnagram(String str, String str1)
	{
	
		boolean flag=true;
		
		char[] strArray=str.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] strArray1=str1.replaceAll("\\s", "").toLowerCase().toCharArray();
		
		if(str.length()!=str.length())
		{
			flag=false;
		}
		else
		{
			int[] hashTable=new int[25];
			
			for(int i=0;i<strArray.length;i++)
			{
				hashTable[strArray[i]-97]++;
			}
			
			for(int i=0;i<strArray1.length;i++)
			{
				hashTable[strArray1[i]-97]--;
			}
			
			for(int i=0;i<hashTable.length;i++)
			{
				if(hashTable[i]!=0)
				{
					flag=false;
					break;
				}
			}
		}
		
		return flag;
	}

}
