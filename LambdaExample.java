package XYZ;
interface message{
	void say();
}
public class LambdaExample {

	public static void main(String[] args) {
		message hellomessage = () -> System.out.println("This is LambdaExample  ");
		hellomessage.say();
	}

}
