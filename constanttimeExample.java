package java11_6_2025;

public class constanttimeExample {

	public static void printFirstElement(int[] arr) {
		if(arr.length>0) {
			for(int i=0;i<arr.length;i++) {
			System.out.println("elements are: "+ arr[i]);
			}
		}else {
			System.out.println("Array is empty.");
		}
	}
	public static void main(String[] args) {
		int[] number= {10,20,30,40,50};
		printFirstElement(number);
		
	}

}
