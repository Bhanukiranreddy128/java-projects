package XYZ;

class Car1 implements Runnable{
    public void run() {
        for(int i=1; i<=3; i++) {
            System.out.println("Car moving " + i);
            try {
            	Thread.sleep(500);
            }catch(Exception e){
            	
            }
        }
    }
}

class Bike1 implements Runnable{
    public void run() { 
        for(int i=1; i<=3; i++) {
            System.out.println("Bike is moving " + i);
            try {
            	Thread.sleep(500);
            }catch(Exception e){
            	
            }
            
        }
    }
}

public class RunnableInterface {
    public static void main(String[] args) {
    	Thread Car1Thread = new Thread(new Car1());
    	Thread Bike1Thread = new Thread(new Bike1());
    	Car1Thread.start();
    	Bike1Thread.start();
    	

    			
    	
    }
}
