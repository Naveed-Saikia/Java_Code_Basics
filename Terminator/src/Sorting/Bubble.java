package Sorting;

import java.util.Arrays;

public class Bubble {
	static int[] bubble(int[] nums,int i,int end) {
		if(nums.length==0) {
			System.out.print("Empty Array");
			return nums;
		}
		if(end==0) {
			return nums;
		}
		while(i<=end-1) {
			if(nums[i]>nums[i+1]) {
				int temp=nums[i];
				nums[i]=nums[i+1];
				nums[i+1]=temp;
				
			}
			return bubble(nums,i+1,end);
			
			
		}
		return bubble(nums,0,end-1);
	
	}
		
	public static void main(String[] args) {
		int [] nums= {7,44,51,2,31,41};
		int end=nums.length-1;
		bubble(nums,0,end);
		System.out.print(Arrays.toString(nums));
	}

}
