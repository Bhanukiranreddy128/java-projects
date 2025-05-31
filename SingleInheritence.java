package XYZ;

class Animal {
	void eat() {
		System.out.println("Every animal can eat");
		}
	}
class Dog extends Animal{
	void dog() {
		System.out.println("Dog is also eat");
	}

}
class SingleInheritence{
	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.eat();
		obj.dog();
	}
}
