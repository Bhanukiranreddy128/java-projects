package XYZ;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetExample1 {
	public static void main(String[] args) {
		HashSet<String> Students=new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the names of 5 students:");
		for(int i=1;i<=5;i++) {
			
			System.out.println("Enter the name of student"+i+":");
			String name = sc.nextLine();
			Students.add(name);
		}
		System.out.println("Students names are:");
		for(String Student:Students) {

			System.out.println(Student);
			
		}
		sc.close();
	}

}
