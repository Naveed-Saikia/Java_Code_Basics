package additional;

//Inheritence---1ST Property


class Base{
    int num;
	String name;
	Base(String n){
		this.name=n;
		}
	
	Base(){
	System.out.println("This is base class");
	}
	void greeting() {
		System.out.println("Hello");
	}
	
	public String toString() {
		return this.name;
	}
}


class child extends Base{
	String gender;
	child(int now,String never,String real){
		
		super(never);//Use of the spuper class, make sure the variables used are the same in parent
		         // and child classes
		
		this.num=now;
		
		this.gender=real;
		
		
	}
	child(){
		super();
		this.gender="Male";
		System.out.println("Baseless constructor");
	}
	int extend=num+6;
	void pillar() {
		System.out.println("This is CHild Class");
		System.out.println(extend);
	}
	
	// Checking Multiple inheritance
	
	
	child(child other){
		
	}
	
	
}

public class OOPS_4_mains {
	
	public static void main(String [] args) {
		Base obj=new Base("Rishav");
		child super_test=new child();
		obj.num=25;
		
		obj.greeting();
		child obj_jun=new child(3,"Vicky","Male");
		obj_jun.greeting();
		obj_jun.pillar();
		System.out.println(obj);
		System.out.println(obj_jun);
		
		
		
		
	}

}


