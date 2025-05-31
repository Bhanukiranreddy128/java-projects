package XYZ;
class Animal3 {
	void eat() {
		
		System.out.println("Every animal can eat");
		}
	}
class Dog3 extends Animal3{
	void dog() {
		System.out.println("Dog is also eat");
	}

}
class Cat3 extends Animal3{
	void cat() {
		System.out.println("Cat mostly like fish");
	}
}

public class Hierarchical_Inheritence {  /*Hierarchical Inheritence means the all chaild class
                                         can use parent class properties(or)resources*/

	public static void main(String[] args) {
		Dog3 obj1=new Dog3();
		Cat3 obj=new Cat3();
		obj.eat();
		obj.cat();
		obj1.dog();
		
		
	}

}
