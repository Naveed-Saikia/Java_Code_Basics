package Recursion;

import java.util.Arrays;

public class Merge_OWN {
	
	static int n;
	static int[] arr3=new int[n];
	
	static int[] Merge(int arr[]) {
		
		n=arr.length/2;
		int [] a= helper(Arrays.copyOfRange(arr, 0,n),0,n-1,0);
		int [] b= helper(Arrays.copyOfRange(arr, n,2*n),0,(2*n-1),0);
		arr= merger(a,b,0,0,0);
		return arr;
		
		
	}
	static int[] helper(int[] arr, int start,int end,int max) {
		if(end==0) {
			return arr;
		}
		if(end>start) {
			if(arr[start]>arr[max]) {
				helper(arr,start+1,end,start);
			}else {
				helper(arr,start+1,end,max);
			}
			
		}
		else {
			int temp=arr[max];
			arr[max]=arr[end-1];
			arr[end-1]=temp;
		}
			return helper(arr,0,end-1,0);
			
	}
	
	static int[] merger(int[] arr1,int[] arr2,int i,int j,int ind) {
		if(i==arr1.length && j!=arr2.length) {
			arr3[ind]=arr2[j];
			merger(arr1,arr2,i,j++,ind++);
		}
		if(i!=arr1.length && j==arr2.length) {
			arr3[ind]=arr1[i];
			merger(arr1,arr2,i++,j,ind++);
		}
		else {

			if(arr1[i]<arr2[j]) {
				arr3[ind]=arr1[i];
				merger(arr1,arr2,i++,j,ind++);
			}
			else {
				arr3[ind]=arr2[j];
				merger(arr1,arr2,i,j++,ind++);
				
			}
		}
			return arr3;
		
		
		
		
	}
	public static void main(String args[]) {
		int arr[]= {55,1,43,20,65,13};
		Merge(arr);
		System.out.print(Arrays.toString(arr));
	}
	

}
