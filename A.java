package XYZ;
 abstract class Machine{
	abstract void ATM();
	void ATM2() {
		System.out.println("ATM is using with php");
	}
	}
class Bank extends Machine{
	void ATM() {
		System.out.println("ATM machine using java");
	}
}
interface Deposit{
	public void Amount();
}
public class A implements Deposit{
	public void Amount() {
		System.out.println("Deposit your Amount");
	}
	public static void main(String[] args) {
		Bank b=new Bank();
		A c=new A();
		b.ATM();
		b.ATM2();
		c.Amount();
	}
		
		
	}
