package nvJavaPrograms;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String str ="!@#$%^&*(-=Sanjay []\\||//'\"`~!.<>~`Chandel?9811280631";
		 str= str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
	}

}
