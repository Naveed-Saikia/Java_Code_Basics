package Interfaces;

public interface Engine {
	int num=980;
	
	final int price=980000;
	
	abstract void start();
	abstract void stop();
	abstract void aceelerate();
	
	default void greeting(String name) {
		System.out.print("Welcome to your new "+name+" car");
	}
	

}
