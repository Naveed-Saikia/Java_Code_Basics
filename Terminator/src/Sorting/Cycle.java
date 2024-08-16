package Sorting;
import java.util.*;

public class Cycle {
	static int[] Csort(int[] nums,int index) {
		if(index==nums.length) {
			return nums;
		}
		
			if(nums[index]!=index+1) {
				int temp_ind=nums[index]-1;
				int temp=nums[index];
				nums[index]=nums[temp_ind];
				nums[temp_ind]=temp;
				return Csort(nums,index);
			}
			else {
		
		return Csort(nums,index+1);
			}
			
	}
	
	public static void main(String[] args) {
		int[] arr= {3,4,5,2,1};
		Csort(arr,0);
		System.out.print(Arrays.toString(arr));
	}

}
