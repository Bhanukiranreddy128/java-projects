package java11_6_2025;

public class BubbleSort {

	public static void main(String[] args) {
		       
		        String[] names = {"bhanu","chaitanya","sai","bhargavi"};

		        for (int i = 0; i < names.length - 1; i++) {
		            for (int j = 0; j < names.length - 1; j++) {
		                if (names[j].compareTo(names[j + 1])>0) {
		                    String temp = names[j];
		                    names[j] = names[j + 1];
		                    names[j + 1] = temp;
		                }
		            }
		        }

		        System.out.print("Sorted String: ");
		        for(String s:names) {
		        	System.out.println(s);
		        }
		    }

		
	}
