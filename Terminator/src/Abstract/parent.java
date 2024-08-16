package Abstract;

public abstract class parent {
	int age;
	final int free=7;
	parent(int a){
		this.age=a;
		
	}
	void greeting() {
		System.out.print("Welcome!");
	}
static void hello() {
	System.out.println("Ola");
		
	}
	abstract void Profession(String p);
	abstract void partner(String n);

}
