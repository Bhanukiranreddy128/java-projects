package Bhanu128;

import java.util.Scanner;
import java.util.Stack;

public class StackKichenExample {

	public static void main(String[] args) {
		Stack<String> Plates=new Stack<String>();
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		System.out.println("Enter the plates you Washed:");
		for(int i=1;i<=A;i++)
		{
			Plates.push("plate "+i);


		}
		System.out.println(Plates);
		System.out.println("Take the plate if you eat(y or N)");
		String S=sc.nextLine();
		while(S="y") {
			System.out.println(Plates.pop();); 
		}
		System.out.println(Plates);
	}

}
