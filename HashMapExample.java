package XYZ;

import java.util.HashMap;
public class HashMapExample {
	public static void main(String[] args) {
		HashMap<Integer, String>  StudentsList=new HashMap<Integer, String>();
		StudentsList.put(1, "Dhoni");
		StudentsList.put(2, "Virat");
		StudentsList.put(3, "Rohit");
		StudentsList.put(1, "Dhoni");
		
		System.out.println(StudentsList);

	}

}
