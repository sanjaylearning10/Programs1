package nvJavaPrograms;

public class PrintStringWIthOutLoop {

	public static void main(String[] args) {
		String name="Hanuman";
		
		String s= "i";
		
		s=s.replaceAll("i", "iiiiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiiiii");
		
		s=s.replaceAll("i", name + "\n");
		System.out.println(s);

	}

}
