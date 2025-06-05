package Bhanu128;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String Day=sc.nextLine().toLowerCase();
		switch (Day) {
		case "monday":
			System.out.println("Lets learn java");
			break;
		case "tuesday":
			System.out.println("Lets learn Dsa");
			break;
		case "wenasday":
			System.out.println("Lets learn python");
			break;
		case "thursday":
			System.out.println("Lets learn Cobalt");
			break;
		case "friday":
			System.out.println("Lets learn Html");
			break;
		case "saterday":
			System.out.println("Lets learn css");
			break;
		case "sunday":
			System.out.println("Lets learn js");
			break;
		default:
			break;
		}
	}

}
