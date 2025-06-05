package Bhanu128;
class OopsTask{
	public static void main(String[] args) {
	private int rollno;
	private String name;
	private int marks;
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void checkresult() {
		if(marks>=40) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}	
	OopsTask s=new OopsTask();
	System.out.println("rollNo "+ s.setRollno());
	System.out.println("Name "+ s.setName());
	System.out.println("Marks "+s.setMarks);
	System.out.println("result "+s.checkresult());
	student s=new student();
	s.setRollno(3307);
	s.setName("Bhanu");
	s.setMarks(46);
	s.checkresult();
	}
	}
}
