package XYZ;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentLinkedList {
	public static void main(String[] args) {
		LinkedList<String> Students=new LinkedList<String>();
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
