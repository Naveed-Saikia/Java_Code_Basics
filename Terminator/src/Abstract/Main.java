package Abstract;

public class Main {
	public static void main(String args[]) {
		child obj=new child(27);
		obj.partner("Riya");
		obj.Profession("Coder");
		
		//obj.free=99;=----Final values cant be immuted
		
		//obj.hello();-------- should be called in a static way
		
		parent.hello();
		
		//parent mom=new parent();---- cannot create object of abstract class
	}

}
