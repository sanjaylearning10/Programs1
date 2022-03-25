package nvJavaPrograms;

public class MissingNUmberInArray {

	public static void main(String[] args) {
		
		int[] array= new int[]{12,15,17,20};

		int[] hash= new int[21];
		
		for(int i=0;i<array.length;i++)
		{
			hash[array[i]]++;
		}
		
		for(int i=11;i<hash.length;i++)
		{
			if(hash[i]==0)
				System.out.println("Missing number in Arrays are "+ i);
		}
	}

}
