package DSA;

public class MergeSortingAlgo {

	public static void main(String[] args) {
		int[] array = {3, 1, 2, 5, 0, 3, 2, 4, 6};
		mergeSort(array,0,array.length-1);
		displayArray(array);
		
	}
	
	public static void displayArray(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	public static void mergeSort(int[] array, int low, int high)
	{
		if(low<high)
		{
			int mid=(low+(high-1))/2;
			mergeSort(array,low, mid);
			mergeSort(array, mid+1, high);
			mergeArray(array, low, mid, high);	
		}
	}

	public static void mergeArray(int[] array, int low, int mid, int high)
	{
		 
		int n1 = mid-low+1;
		int n2 =high-mid;

		int[] L = new int[n1];
		int[] R = new int[n2];
		
		int i=0;
		int j=0;
		int k=0;
		
		for(int x=0;x<n1;x++)
		{
			L[x]=array[low+x];
		}
		for(int x=0;x<n2;x++)
		{
			R[x]=array[mid+1+x];
		}
		
		
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				array[k]=L[i];
				k++;
				i++;
			}
			else
			{
				array[k]=R[j];
				k++;
				j++;
			}
		}
		
		while(i<n1)
		{
			array[k]=L[i];
			k++;
			i++;
		}
		
		while(j<n2)
		{
			array[k]=R[j];
			k++;
			j++;
		}
	}
}
