package nvJavaPrograms;

public class SubStringInGivenArray {

	public static void main(String[] args) {
		
		String str="Sanjay chandel";
		String str1= "ch";
		System.out.println(matchString(str,str1));
		System.out.println("******************");
		System.out.println(containsString(str,str1));
		System.out.println("******************");
		System.out.println(indexOfString(str,str1));
	}
	
	public static boolean matchString(String str, String str1)
	{
		return str.matches("(.*.)"+str1+"(.*)");	
	}
	

	public static boolean containsString(String str, String str1)
	{
		return str.contains(str1);	
	}
	
	public static boolean indexOfString(String str, String str1)
	{
		return str.indexOf(str1)!=-1;	
	}

}
