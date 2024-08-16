package Comparison;

public class compare implements Comparable<compare>{
	int roll_no;
	float marks;
	
	compare(int r,int m){
		this.marks=m;
		this.roll_no=r;
				
	}
//-------------How to compare and which variable to compare we select here-----------------
	
	@Override
	public int compareTo(compare o) {
		int diff=(int)(this.marks-o.marks);// (int)---casting is required as marks could be of float type
		return diff;
		// diff >0 this is bigger and if<0 o is bigger
	}

}


class compare_j extends compare{
	String name;
	compare_j(int r,int m,String s){
		super(r,m);
		this.name=s;
	}
	
}