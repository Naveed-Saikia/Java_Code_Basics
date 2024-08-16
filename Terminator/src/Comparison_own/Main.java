package Comparison_own;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(77);
		list2.add(88);
		list2.add(19);
		System.out.println(list2);
		comparing stud1=new comparing(88,"Naveed");
		comparing stud2=new comparing(95,"Mrigo");
		comparing stud3=new comparing(91,"Rishaan");
		
		comparing[] list= {stud1,stud2,stud3};
		
		System.out.println(Arrays.toString(list));
		Arrays.sort(list, new comparing());
		System.out.println(Arrays.toString(list));
	}

}
