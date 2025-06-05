package Bhanu128;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IceCream_Queueexample {

	public static void main(String[] args) {
		Queue<String> IceCreamLine=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		String kids=sc.nextLine();
		for(int i=1;i<IceCreamLine.size();i++) {
		IceCreamLine.add(kids);
		System.out.println(IceCreamLine);

		}
		
	}
}
