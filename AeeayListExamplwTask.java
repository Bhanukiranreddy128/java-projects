package Bhanu128;

import java.util.ArrayList;

public class AeeayListExamplwTask {

	public static void main(String[] args) {
		ArrayList<String> charecter=new ArrayList<String>();
		charecter.add("RollNo21");
		charecter.add("Ben10");
		charecter.add("Doremon");
		charecter.add("Chotabeem");
		charecter.add("NinjaHatori");
		charecter.remove("Chotabeem");
		System.out.println(charecter);

		int index=charecter.indexOf("Ben10");
		if(index!=-1) {
			charecter.set(1, "MotuPathlu");
		}
		for(int i=0;i<charecter.size();i++) {
			System.out.println(charecter.get(i));
		}
	}

}
