package ListApplications;

import java.util.Scanner;
import java.util.TreeSet;

public class SearchFunctionalityTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<String> itams=new TreeSet<String>();
		itams.add("keyboard");
		itams.add("Mouse");

		itams.add("moniter");
		itams.add("cpu");
		itams.add("webcam");
		String itam=sc.nextLine();
		System.out.println(itams);
		if(itams.contains(itam)==true) {
			System.out.println("The "+itam+" is there in a list of itams");
		}
		
		

		
	}

}
