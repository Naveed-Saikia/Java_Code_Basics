package Recursion;

import java.util.Arrays;

public class Patterns {
	
	//pattern 1------
	/*  ****
	 *  ***
	 *  **
	 *  *
	 */
	
	
	static void triangles1(int r,int c) {
		if(r==0) {
			return;
		}
		if(r>c) {
			System.out.print("* ");
			triangles1(r,c+1);
		}
		else {
			System.out.println();
			triangles1(r-1,0);
		}
	}
	
	/* PATTERN 2
	 * REVERSE OF 1
	 * 
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * ******
	 */
	static void triangles2(int r,int c) {
		if(r==0) {
			return;
		}
		if(r>c) {
			
			triangles2(r,c+1);
			System.out.print("* ");
		}
		else {
			
			triangles2(r-1,0);
			System.out.println();
		}
	}
	
	
	
	static void Bubble(int[] arr,int start,int end) {
		if(end==0) {
			return;
		}
		if(end>start) {
			if(arr[start]>arr[start+1]) {
			int temp=arr[start];
			arr[start]=arr[start+1];
			arr[start+1]=temp;
			}
			Bubble(arr,start+1,end);
		}
		Bubble(arr,0,end-1);
	}
	static int Max=0;
	static int index;
	
	static void Selection(int [] arr,int start,int end,int max) {
		
		if(end==0) {
			return;
		}
		if(end>start) {
			if(arr[start]>arr[max]) {
				Selection(arr,start+1,end,start);
			}else {
			Selection(arr,start+1,end,max);
			}
		}else {

		int temp=arr[max];
		arr[max]=arr[end-1];
		arr[end-1]=temp;
		}
		
		Selection(arr,0,end-1,0);
		}
		
	
	
	public static void main(String args[]) {
		int[] arr = {7,6,33,2,9,4};
		int[] arr2= {7,6,33,2,9,4};
		triangles1(6,0);
		System.out.println();
		triangles2(6,0);
		Bubble(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		Selection(arr2,0,arr2.length,0);
		System.out.println(Arrays.toString(arr2));
		
	}

}
