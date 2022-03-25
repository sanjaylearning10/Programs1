package nvJavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CreateMatrix4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int m=sc.nextInt();
		System.out.println("Enter number of columns");
		int n=sc.nextInt();
		int[][] array=new int[m][n];
		
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Traverse the Matrix");
		
		System.out.println(Arrays.deepToString(array));
	}

}
