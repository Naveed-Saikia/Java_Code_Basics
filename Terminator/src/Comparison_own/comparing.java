package Comparison_own;

import java.util.Comparator;

public class comparing implements Comparator<comparing> {
	int marks;
	String name;
	
	comparing(){
		
	}
	comparing(int m,String s){
		this.marks=m;
		this.name=s;
		
	}
	@Override
	public String toString() {
		return marks+""; /// no need to put commas as it will return list in proper format
		
	}
	@Override
	public int compare(comparing o1, comparing o2) {
		int diff=(int)(o1.marks-o2.marks);
		return diff;
	}

}
