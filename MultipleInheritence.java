package XYZ;

class Animal1 {
	void eat() {
		System.out.println("Every animal can eat");
		}
	}
class Dog1 extends Animal1{
	void dog() {
		System.out.println("Dog is also eat");
	}

}
class Cat extends Animal1{
	void cat() {
		System.out.println("Cat mostly like fish");
	}
}
public class MultipleInheritence {

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.eat();
		obj.cat();
		
	}

}
