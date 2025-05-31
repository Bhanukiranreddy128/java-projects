package XYZ;

class Animal2 {
	void eat() {
		System.out.println("Every animal can eat");
		}
	}
class Dog2 extends Animal2{
	void dog() {
		System.out.println("Dog is also eat");
	}

}
class Cat1 extends Dog2{
	void cat() {
		System.out.println("Cat mostly like fish");
	}
}
public class Multilevel_Inherirence {  /*Multilevel Inherirence means the properties used one chaild class 
                                         to another chaild class(level wise)*/

	public static void main(String[] args) {
		Cat1 obj=new Cat1();
		obj.eat();
		obj.dog();
		obj.cat();

	}

}
