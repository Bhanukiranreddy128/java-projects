package XYZ;
class Calculater{
	int calculater(int a,int b) {
		return a+b;
	}
	double calculater(double a,double b) {
		return a+b;
	}
	int calculater(int a,int b,int c) {
		return a+b;
	}
}

public class OverloadingExample {

	public static void main(String[] args) {
		Calculater c= new Calculater();
		System.out.println(c.calculater(2, 4));
		System.out.println(c.calculater(2.5,4.5));
		System.out.println(c.calculater(2,4,5));
	}

}
