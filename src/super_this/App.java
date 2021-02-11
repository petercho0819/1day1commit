package super_this;

public class App {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}

}

class Parent { int x = 10;}

class Child extends Parent{
	
	int x = 20;
	void method() {
		System.out.println("x는 " + x);
		System.out.println("this.x는 " + this.x);
		System.out.println("super x는 :" + super.x);
	}
}