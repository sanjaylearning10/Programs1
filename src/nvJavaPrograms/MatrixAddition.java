package nvJavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int m=sc.nextInt();
		System.out.println("Enter number of columns");
		int n=sc.nextInt();
		int[][] array=new int[m][n];
		int[][] array1=new int[m][n];
		int[][] result=new int[m][n];
		
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Traverse the Matrix");
		
		for(int[] r:array)
		{
			System.out.println(Arrays.toString(r));
		}
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				array1[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Traverse the Matrix1");
		
		for(int[] r:array1)
		{
			System.out.println(Arrays.toString(r));
		}
		
		
		System.out.println("Operation on the provided  Matrix");
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				result[i][j]=array[i][j]+array1[i][j];
			}
		}
		
		System.out.println("Display the result of   Matrix");
		
		for(int[] r:result)
		{
			System.out.println(Arrays.toString(r));
		}
	}

}
