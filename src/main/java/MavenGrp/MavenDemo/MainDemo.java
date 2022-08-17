package MavenGrp.MavenDemo;

class Animal{
	
	public Animal() {
		System.out.println("Im the constructor");
	}
	public String color="White";
	public void disp() {
		System.out.println("I am the disp method");
	}
}

class Dog extends Animal{
	
	public Dog() {
		super();
		System.out.println(super.color);
		super.disp();
	}
	
	public String color = "Black";
	public void disp() {
		System.out.println("I am the disp child method");
	}
}

public class MainDemo {

	public static void main(String[] args) {
		
		
		Dog dg = new Dog();
		dg.disp();
		System.out.println(dg.color);
		
	}

}
