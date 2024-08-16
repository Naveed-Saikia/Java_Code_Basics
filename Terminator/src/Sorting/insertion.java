package Sorting;
import java.util.*
;
public class insertion {
	static int[] Insertion(int[] nums,int i,int end) {/// (nums,0,1)
		int[] arr;
		
		if(nums.length==0) {
			System.out.print("Empty array");
			return nums;
		}
		if(end==nums.length) {
			return nums;
		}
		else {
	
		
			arr=Arrays.copyOfRange(nums, i, end+1);
			bubble(arr,i,arr.length-1);
			
			for(int a=0;a<=end;a++) {
				nums[a]=arr[a];
			}
		}
			return Insertion(nums,0,end+1);
	
		
	}
	
	static int[] bubble(int arr[],int start,int end) {
		if(end==0) {
			return arr;
		}
		while(start<=end-1) {
			if(arr[start]>arr[start+1]) {
				int temp=arr[start];
				arr[start]=arr[start+1];
				arr[start+1]=temp;
				
			}
			start++;
			
		}
		return bubble(arr,0,end-1);
		
	}
	
	public static void main(String[] args) {
		int[] nums= {7,2,4,55,11,23,3,9};
		Insertion(nums,0,1);
		System.out.print(Arrays.toString(nums));
		
	}

}
