package XYZ;
import java.util.LinkedList;
public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> Friends=new LinkedList<String>();
		
		Friends.add("Chaitanya");
		Friends.add("pandu");
		Friends.add("jeevan");
		Friends.add("jayanth");
		
		System.out.println(Friends);

		Friends.addFirst("jayanth");
		Friends.add(1,"vishnu");
		

		System.out.println(Friends);


	}

}
