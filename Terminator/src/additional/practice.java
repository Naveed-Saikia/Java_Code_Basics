package additional;

 class lower{
	 private int num;
	 String name;
	 int temp;
	 
	 lower(String s){
		 this.name=s;
	 }
	
}

public class practice {
	private int hello;
	String newer;
	
	public static void main(String args[]) {
		lower obj1=new lower("Fredy");
		obj1.num=77; /// private not visible
		practice obj2=new practice();
		obj2.hello=88; // we can access it as it is a part of main class which is inside class practice
	}

}
