package ListApplications;

import java.util.TreeSet;

public class TreeSerExampleTask {

	public static void main(String[] args) {
		TreeSet<Integer> books=new TreeSet<Integer>();
		books.add(5002);
		books.add(4998);

		books.add(5005);

		books.add(4999);

		books.add(5001);
		System.out.println(books);
		books.first();
		books.last();
		

	}

}
