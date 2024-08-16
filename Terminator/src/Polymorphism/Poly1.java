package Polymorphism;

class Shapes{
	Shapes(){
		System.out.println("Irelevant---just checking super once");
	}
	void area() {
		System.out.println("This belongs to shape class");
	}
}

class circle extends Shapes{
	
	circle(){
		super();
	}
	
	//---------------------overriding concept------------------
	@Override
	void area() {
		System.out.println("Area is pi*r*r");
	}
}

public class Poly1 {
	public static void main(String args[]) {
		
		Shapes shape=new Shapes();
		Shapes obj=new circle();
		
		
		obj.area();
	}
	
	

}
