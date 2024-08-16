package Recursion;
import java.util.*;

public class Rec_2_Arrays {
	static ArrayList<Integer> list=new ArrayList<>();
	
	
	
	static ArrayList<Integer> clean(ArrayList<Integer> list){
		
			list.clear();
			return list;
	
	}
	static int search(int[] arr,int item,int index) {
		if(index==arr.length) {
			return -1;
		}
		if(arr[index]==item) {
			list.add(index);
			return search(arr,item,index+1);
		}
		else {
			return search(arr,item,index+1);
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]= {7,8,10,44,33,10};
		search(arr,33,0);
		System.out.println(list);
		clean(list);
		search(arr,10,0);
		System.out.println(list);
		
	}

}
