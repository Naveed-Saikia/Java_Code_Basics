package Sorting;

import java.util.Arrays;

public class Selection {
	static int[] Selection_Sort(int [] nums,int ind,int end,int max,int max_ind) {
		if(nums.length==0) {
			System.out.print("Empty array");
			return nums;
		}
		if(end==-1) {
			return nums;
		}
		while(ind!=end+1) {
			if(nums[ind]>=nums[max_ind]) {
				max=nums[ind];
				max_ind=ind;
			}
			ind++;
		}
		int temp=nums[max_ind];
		nums[max_ind]=nums[end];
		nums[end]=temp;
		max_ind=0;
		max=0;
		return Selection_Sort(nums,0,end-1,max,max_ind);
		
	}
	
	public static void main(String[] args) {
		int[] nums= {7,8,16,4,11,19,2};
		int end=nums.length-1;
		Selection_Sort(nums,0,end,0,0);
		System.out.print(Arrays.toString(nums));
	}

}
