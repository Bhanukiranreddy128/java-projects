package Bhanu128;

import java.util.Scanner;

public class Rainumbrella {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String isRaining=sc.nextLine();
		sc.close();
		if(isRaining.equalsIgnoreCase("true")) {
			System.out.println("take an umbrella");
		}else if(isRaining.equalsIgnoreCase("false")) {
			System.out.println("No need of umbrella");
		
		}else {
			System.out.println("Enter true or false omly");
		}
		
		
		
	}

}
