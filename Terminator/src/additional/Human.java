package additional;



public class Human {
	
	class A{
		String na;
		int ag;
		A(int a, String n){
			this.ag=a;
			this.na=n;
		}
		
	// Class A is only accessible if its static
	
	
	
		
		
	}
	public String toString() {
		return name;
	}
	public static void main(String [] args) {
		A neww2=new A(25,"Aarav");
		
		Human neww=new Human(25,"rohan",false);
		System.out.println(neww);
		neww.greeting();
		hello();
		
	}
	static void hello(){
		System.out.println(Human.population);
		
	}
	
		
	
	int age;
	String name;
	boolean married;
	static int population;
	
	Human(int a,String s,boolean m){
		this.age=a;
		this.name=s;
		this.married=m;
	    this.population+=1;
		
		
	}
	
	
	
	
	void greeting() {
		System.out.print("Hello World");
		
	}

}

