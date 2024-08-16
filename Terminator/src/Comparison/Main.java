package Comparison;

import java.util.Arrays;

public class Main  {
	public static void main(String[] args) {
		
		compare stud1=new compare_j(27,79,"varun");
		compare stud2=new compare_j(35,64,"Rishabh");
		compare stud3=new compare_j(32,85,"vashy");
		compare stud4=new compare_j(14,90,"virat");
		
		compare[] list= {stud1,stud2,stud3,stud4};
		
		System.out.print(Arrays.toString(list));
		
		System.out.print(stud1.compareTo(stud3));
	
	}
		

		
}	
