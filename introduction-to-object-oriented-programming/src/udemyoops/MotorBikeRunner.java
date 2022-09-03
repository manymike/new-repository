package udemyoops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new  MotorBike(100);
		MotorBike honda = new MotorBike(200);
		
		ducati.start();
		honda.start();
	
		ducati.setSpeed(100);
		honda.setSpeed(80);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
		ducati.increaseSpeed(100);
		honda.increaseSpeed(100);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
		
		ducati.decreaseSpeed(100);
		honda.decreaseSpeed(100);
		
		System.out.println(ducati.getSpeed());
		System.out.println(honda.getSpeed());
	}

}
