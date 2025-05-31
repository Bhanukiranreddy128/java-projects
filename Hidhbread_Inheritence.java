package XYZ;
class Animal4 {
	void eat() {
		System.out.println("Every animal can eat");
		}
	}
class Dog4 extends Animal4{
	void dog() {
		System.out.println("Dog is also eat");
	}

}
class Cat4 extends Dog4{
	void cat() {
		System.out.println("Cat mostly like fish");
	}
}

public class Hidhbread_Inheritence {      /*Hidhbread Inheritence means the cobination of remaining inheritence like
                                            (Single,multiple,multilevel,hierarchical)*/

	public static void main(String[] args) {
		Cat4 obj=new Cat4();
		Dog4 obj1=new Dog4();
		obj.cat();
		obj.dog();
		obj1.eat();
		
		

	}

}
