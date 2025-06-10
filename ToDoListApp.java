package ListApplications;

import java.util.ArrayList;
import java.util.Scanner;
public class ToDoListApp {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<String> tasks=new ArrayList<String>();
		while(true) {
			System.out.println("simple to-do-list");
			System.out.println("1.add a task");
			System.out.println("2.view a task");
			System.out.println("3.delete a task");
			System.out.println("4.exit");
			System.out.println("choose an option(1-4)");
			int choice=sc.nextInt();
			sc.nextLine();
		
		if(choice==1) {
			System.out.println("enter yout task");
			String task=sc.nextLine();
			tasks.add(task);
			System.out.println("task added succesfully");
		}
		else if(choice==2) {
			if(tasks.isEmpty()) { 
				System.out.println("no tasks there");
			}
			else {
				System.out.println("your task");
				for(int i=0;i<tasks.size();i++) {
					System.out.println((i+1)+" "+tasks.get(i));
				}
			}
		}
		else if(choice==3) {
			if(tasks.isEmpty()) {
				System.out.println("npthing to delete");
			}
		else {
			System.out.println("enter the number to delete");
			int num=sc.nextInt();
			if(num>=1 && num<=tasks.size()) {
				tasks.remove(num-1);
				System.out.println("task delete");
			}else {
				System.out.println("invalid number");
			}
		}
		}
		else if(choice==4) {
				System.out.println("hasta lavista !");
				break;
			}else {
				System.out.println("please choose a valid option");
			}
		}

	}
}