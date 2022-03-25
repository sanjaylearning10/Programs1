package nvJavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		
		int[][] array= {{0,1,2},{3,4,5}};
		int[][] array1= {{6,7},{8,9},{10,11}};
		int[][] result=new int[2][2];
		
		
		
		
		System.out.println("Traverse the Matrix");
		
		for(int[] r:array)
		{
			System.out.println(Arrays.toString(r));
		}
		
		System.out.println("Traverse the Matrix1");
		
		for(int[] r:array1)
		{
			System.out.println(Arrays.toString(r));
		}
		
		for(int i=0;i<2;i++) 
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<3;k++)
				{
				result[i][j]+=array[i][k]*array1[k][j];
			}
			}
		}
		
		
		System.out.println("Traverse the Result");
		
		for(int[] r:result)
		{
			System.out.println(Arrays.toString(r));
		}
	}

}
