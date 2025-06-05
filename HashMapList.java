package Bhanu128;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapList {

	public static void main(String[] args) {
		Map<Integer, String> Students=new HashMap<Integer, String>();
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
			int id=sc.nextInt();
			String name=sc.nextLine();
			
			Students.put(id, name);
			
			System.out.println(Students);
		}
		System.out.println("Enter the kay that you want to remove:");
		int key=sc.nextInt();
		if(Students.containsKey(key)) Students.remove(key);
		System.out.println(Students);
		sc.nextLine();
		System.out.println("Do you want to update any value:");
		if(sc.nextLine().equals("y")) {
			System.out.println("Enter the kay and valur to update the value:");
			key=sc.nextInt();
			String s=sc.nextLine();
			Students.replace(key, s);
			System.out.println(Students);
			
		}
		System.out.println("Enter the kay to check");
		if(Students.containsKey(sc.nextInt()))  System.out.println("Key is available");
		if(Students.containsValue(sc.nextLine())) System.out.println("Value is available");
		System.out.println(Students.keySet());
		System.out.println(Students.values());
		
		
	}

}
