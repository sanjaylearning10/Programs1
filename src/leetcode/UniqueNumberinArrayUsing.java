package leetcode;

public class UniqueNumberinArrayUsing {

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,5,6,6,3,2,4};
		
		int x=0;
       int[] arr= new int[nums.length];
       
       for(int i=0;i<nums.length;i++)
       {
    	arr[i]=arr[nums[i]]+1;   
       }
       
       for(int i=0;i<arr.length;i++)
       {
    	   if(arr[i]==2)
    	   {
    		   System.out.println(arr[i]);
    	   }
       }

         
	}
}
