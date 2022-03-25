package leetcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
	
	    public int thirdMax(int[] nums) {
	        Set<Integer> customeSet= new HashSet<Integer>();
	        for(int i=0;i<nums.length;i++)
	        {
	            customeSet.add(nums[i]);
	        }
	        
	        if(customeSet.size()>=3)
	        {
	            customeSet.remove(Collections.max(customeSet));
	            customeSet.remove(Collections.max(customeSet));
	        }
	            
	        return Collections.max(customeSet);    
	    }
	}


