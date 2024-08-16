package Interfaces;

public class Main {
	public static void main(String args[]) {
		Car obj=new Car();
		Engine obj_2=new Car();
		System.out.println(Engine.num);
		obj_2.greeting("Honda");
		System.out.println(Engine.price);
		obj.aceelerate();
		obj.brake();
		obj.start();
		obj.start_music();
	}
		

}

	
