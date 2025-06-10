package ListApplications;

abstract class cars{
	abstract void start();
	abstract void driver();
	abstract void stop();
	void MusicSystem() {
		System.out.println("playing music");
		
	}
}
class cars1 extends cars{
	void start() {
		System.out.println("car started using start button");
	}
	void driver() {
		System.out.println("Car is have a driver to move");
	}
	void stop() {
		System.out.println("Clicking the break to stop the car");
	}
}

class AbstactionTask1{
	
	public static void main(String[] args) {
		cars1 obj=new cars1();
		obj.start();
		obj.driver();
		obj.stop();
		
			 
			
			
		}
	}


