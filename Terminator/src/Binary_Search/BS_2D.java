package Binary_Search;
import java.util.*;

//Binary Searching in a 2D SORTED ARRAY--------------------------------------------------

public class BS_2D {
	
	
	
	
	static ArrayList<int[]> list=new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		int[][] nums= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		binary(nums,0,nums[0].length-1,8);
		for(int[] pos : list) {
            System.out.println(Arrays.toString(pos));
        }
				
	}
	static ArrayList<int[]> binary(int [][] nums,int row,int column,int target){
		while(row<nums.length && column>=0) {
		if(nums[row][column]==target) {
			list.add(new int[]{row, column});
			return list;
		}
		else if(nums[row][column]<target) {
			return binary(nums,row+1,column,target);
		}
		else {
			return binary(nums,row,column-1,target);
		}
	}
		list.add(new int[] {-1,-1});
		return list;

}
}
