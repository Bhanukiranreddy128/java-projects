package Bhanu128;
import java.util.*;
public class CreatingList {

	public static void main(String[] args) {
		ArrayList<String> StdName=new ArrayList<String>();
		LinkedList<Integer> RollNum=new LinkedList<Integer>();
		HashSet<String> FirstName=new HashSet<String>();
		Map<Integer, String> SudNameRoll=new HashMap<Integer, String>();
		StdName.add("Shiva");
		StdName.add("Bhanu");
		RollNum.add(3307);
		RollNum.add(3308);
		FirstName.add("Manchala");
		FirstName.add("Banala");
		FirstName.add("Manchala");
		SudNameRoll.put(3307, "Bhanu");
		SudNameRoll.put(3308, "sai");
		Collections.sort(StdName);
		Collections.reverse(RollNum);
		RollNum.remove(0);
		if(FirstName.contains("Banala")) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		Iterator<String> iterator = FirstName.iterator();
		System.out.println("Iterating over HashSet:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
		System.out.println(FirstName);
		ArrayList<String> FirstName1=new ArrayList<String>(FirstName);
		


		System.out.println(StdName);
		System.out.println(RollNum);
		System.out.println(FirstName1);
		System.out.println(SudNameRoll);
		
		
		
		
		
		
		
	}

}
