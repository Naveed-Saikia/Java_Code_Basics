
package additional;

public class StaticBlock {
	static int a=7;
	static int b;
	static boolean ch;
	
	static {
		b=a*5;
		System.out.println("Static block encountered");
	}
	
	int age;
	String name;
	
	
	StaticBlock(int a, String n){
		System.out.println((this.age=a) +"Years old");
		System.out.println((this.name=n)+"--Is your name");
		
	}
	StaticBlock(){
		System.out.println("Just a pretty good learning program");
		System.out.println(StaticBlock.a);
		System.out.println(StaticBlock.b);
	}
	
	public static void main(String[] args) {
		
		StaticBlock obj=new StaticBlock(25,"Roy");
		StaticBlock obj_2=new StaticBlock();
		
		//OR
		
		System.out.println(StaticBlock.a+" "+StaticBlock.b+" "+StaticBlock.ch);
		
		/// We dont need to create a new object just to syso the static varaibles values
		
		
	}

}
