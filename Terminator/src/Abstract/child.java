package Abstract;

public class child extends parent {
	
	child(int age){
		super(age);
	}
	
	@Override
	
	void greeting() {
		super.greeting();
		
	}
	
	
	/// Using both the abstract classes 
	@Override
	void Profession(String pr) {
		System.out.println("My career is "+pr);
		
	}	
	@Override
	void partner(String n) {
		System.out.println("My partner name is"+ n);
	}

}
