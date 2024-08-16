package Binary_Search;
import java.util.*;

public class FandL {
	static ArrayList<Integer> list=new ArrayList<>();
	static void First_Last(int[] arr,int start,int end,int target) {
		int mid=start+(end-start)/2;
		if(start>end) {
			return;
		}
		
		if(arr[mid]==target) {
			list.add(mid);
			First_Last(Arrays.copyOfRange(arr, start, mid),start,mid,target);
			First_Last(Arrays.copyOfRange(arr, mid+1, end),start,mid,target);
			
		}
		else if(arr[mid]>target) {
			end=mid-1;
			First_Last(arr,start,end,target);
		}
		else {
			start=mid+1;
			First_Last(arr,start,end,target);
			
		}
		
	
	}
	
	public static void main(String[] args) {
		int[] nums= {7,8,11,11,11,11,11,11,15,17,19,19};
		int[] array=new int[2];
		First_Last(nums,0,nums.length-1,11);
		Collections.sort(list);
		array[0]=list.get(0);
		array[1]=list.get(list.size()-1);
		System.out.print(Arrays.toString(array));
		
	}

}
