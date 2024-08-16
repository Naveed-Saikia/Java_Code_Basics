package Interfaces;

public class Car implements Media,Brake,Engine {
	int num=70;
	
	@Override
	public
	 void start() {
		System.out.println("I brake like a normal car");
		
	}

	@Override
	public void stop() {
		System.out.println("I stop like a normal car");// TODO Auto-generated method stub
		
	}

	@Override
	public void aceelerate() {
		System.out.println("Car is accelerating at a high speed");// TODO Auto-generated method stub
		
	}

	@Override
	public void brake() {
		System.out.println("Car is braking");// TODO Auto-generated method stub
		
	}

	@Override
	public void start_music() {
		System.out.println("Start the player");// TODO Auto-generated method stub
		
	}

	@Override
	public void stop_music() {
		System.out.println("Stop the player");// TODO Auto-generated method stub
		
	}

}


