package ListApplications;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] names= {"Amit","Divya","karan","priya","zoya"};
		System.out.print("Enter the name you want to search:");
		String name=sc.nextLine();
		int Index=Arrays.binarySearch(names, name);
		System.out.println(Index);
			
		}
		
		
	}


