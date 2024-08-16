package Binary_Search;
import java.util.*;

public class Binary_Search {
	
	
	static int ceiling(int[] nums,int start,int end,int max,int target) {
		int mid=(start+end)/2;
		
		
		
		while(start<=end ) {
			if(nums[mid]>=target) {
				end=mid-1;
				max=Math.min(max,nums[mid]);
				System.out.println(max);
				return ceiling(nums,start,end,max,target);
				
			}
			else {
				start=mid+1;
				return ceiling(nums,start,end,max,target);
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] nums= {2,4,7,9,11,15,19,22,27,29,33,40};
		System.out.print(ceiling(nums,0,nums.length-1,7000,34));
	}

}
