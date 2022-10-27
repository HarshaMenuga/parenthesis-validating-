package streams;

abstract class AbstractDemo {
	public AbstractDemo() {
		System.out.println("Constructor calling ");
	}

	abstract int add(int a, int b);

	int sub(int a, int b) {
		return a - b;
	}

	static int multiply(int a, int b) {
		return a * b;
	}
}

class Demo extends AbstractDemo {

	@Override
	int add(int a, int b) {
		return a + b;

	}

}

interface DM {
	public default void say() {
		System.out.println("welcome it's a default method");
	}

	void sayNo(String msg);

	static void sayToHai(String msg) {
		System.out.println("Hiiii " + msg);
	}

}

class DMimplements implements DM {

	@Override
	public void sayNo(String msg) {
		System.out.println("this is an abstract method " + msg);

	}

}

public class DefaultMethod {

	public static void main(String[] args) {
		DMimplements dm = new DMimplements();
		dm.say();
		dm.sayNo("harsha");
		DM.sayToHai("Harsha");
		Demo demo = new Demo();
		System.out.println(demo.add(5, 5));
		System.out.println(demo.sub(5, 5));
		System.out.println(AbstractDemo.multiply(5,5));
	}

}
