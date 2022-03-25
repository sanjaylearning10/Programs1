package leetcode;

public class UniqueNumberinArrayUsingXOR {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,5,6,6,3,2,4};
		System.out.print(uniqueNumber(array));

	}
	
	public static int uniqueNumber(int[] nums)
	{
		int unique = 0;

        for(int n : nums) {
            unique ^= n;
        }

        return unique;
	}

}
