package XYZ;

public class ExHanling {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {int result = a/b;
			System.out.println(result);  //check exceptin

		} catch (ArithmeticException e) {
			System.out.println("zero not /");
		}
		System.out.println("Hello World");

	}

}
