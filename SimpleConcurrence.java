package XYZ;

class MyTask extends Thread{
	private String taskName;
	
	public MyTask(String taskName) {
		this.taskName=taskName;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(taskName+ " Step "+i);
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				System.out.println(taskName + "was interrupted. ");
			}
		}
	}
}

class SimpleConcurrence {

	public static void main(String[] args) {
		MyTask t1 = new MyTask("cooking");
		MyTask t2 = new MyTask("Running");

		t1.start();
		t2.start();
	}

}
