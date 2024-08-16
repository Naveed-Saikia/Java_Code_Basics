package Searching;
import java.util.*;

public class Linear {
	
	
	
	    // Function to perform linear search on a 2D array
	static ArrayList<int[]> list=new ArrayList<>();
	   

	
	static ArrayList<int[]> Linear_2(int [][]arr,int row,int column,int target,ArrayList<int[]> list) {
		
		if(row==arr.length ) {
			return list;
			
		}
		if(column!=arr[row].length) {
		if(arr[row][column]==target) {
			list.add(new int[] {row,column});
			Linear_2(arr,row,column+1,target,list);
		}else {
		
			Linear_2(arr,row,column+1,target,list);
		}
		
	}
		return Linear_2(arr,row+1,0,target,list);
	}
	
	
	
	
	static int max_array(int[] arr,int index,int max) {
		if(index==arr.length) {
			return max;
		}
		if(arr[index]>max) {
			max=arr[index];
		}
		return max_array(arr,index+1,max);
	}
	
	static int LinearSearch(int[] arr,int index,int target) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==target) {
			return index;
		}
			return LinearSearch(arr,index+1,target);
		
	} 
	public static void main(String[] args) {
		int [] arr= {7,33,23,41,55};
		int[][] arr2 = {
			    {7, 33, 23},
			    {41, 55, 23},
			    {14, 5, 41}
			};
		int index_val=LinearSearch(arr,0,41);
		System.out.println(index_val);
		System.out.println(max_array(arr,0,0));
		Linear_2(arr2,0,0,41,list);
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list[row].size();j++) {
				System.out.print(list.get(j));
			}
		}

}
}
