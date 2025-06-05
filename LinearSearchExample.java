package Bhanu128;

import java.util.Scanner;

public class LinearSearchExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] number= {5,8,2,9,4,7};
		System.out.print("Enter the target value:");
		int target=sc.nextInt();
		boolean found=false;
		for(int i=0;i<number.length;i++) {
			if(number[i]==target) {
			System.out.println("found:"+" "+target+" at index "+i);
			found=true;
			break;
			}
			 
		}
		if(!found) {
			System.out.println("number not found");
		}
	}

}
