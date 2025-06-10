package ListApplications;

import java.util.TreeMap;

public class TreeMapExamoleTask1 {

	public static void main(String[] args) {
		TreeMap<String, String> countrys=new TreeMap<String, String>();
		countrys.put("India", "Delhi");
		countrys.put("USA", "Washinton");
		countrys.put("Germany", "Berlin");
		countrys.put("Japan", "Tokyo");
		countrys.put("India", "New Delhi");
		System.out.println(countrys);
	}

}
