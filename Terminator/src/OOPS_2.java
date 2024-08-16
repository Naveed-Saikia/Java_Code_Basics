

class A{
	String name;
	int index;
	int Class;
	A(){
		System.out.print("New object created");
	}
	
	A(String name){
		this.name =name;
	}
	
	
	
}
public class OOPS_2 {
	
	
	public static void main(String[] args) {
		A obj=new A("Rahul");
		System.out.print(obj);
		
		
	}

}
