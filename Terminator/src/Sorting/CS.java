package Sorting;

import java.util.Arrays;

public class CS {
	static int[] CSort(int[] nums,int index) {
		if(index==nums.length) {
			return nums;
		}
	
			if(nums[index]!=index) {// index=0  val =3, index=3 val=4
				int temp_ind=nums[index];
				nums[index]=nums[temp_ind];
				nums[temp_ind]=temp_ind;
				return CSort(nums,index);
				
			}
			else {
				return CSort(nums,index+1);
			}
		
	}
	public static void main(String[] args) {
		int [] arr= {4,2,3,0,1};
		CSort(arr,0);
		System.out.print(Arrays.toString(arr));
	}

}
