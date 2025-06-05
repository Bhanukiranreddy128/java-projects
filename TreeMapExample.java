package Bhanu128;

import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> A=new TreeMap<Integer, String>();
		A.put(1, "Bhanu");
		A.put(2, "Jeevan");
		A.put(3, "Sai");
		A.put(6, "Hari");
		A.put(4, "Hari");
		A.put(5, "manu");
		System.out.println(A);
		System.out.println(A.get(3));
		System.out.println(A.clone());
	}

}
