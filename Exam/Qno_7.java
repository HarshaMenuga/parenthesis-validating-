package exam;

class A{
	public void show() {
		System.out.println("In A");
	}
	static int add(int a,int b) {
		return a+b;
	}
	static double add(double a,double b) {
		return a+b;
	}

}
class B extends A{
	@Override
	public void show() {
		System.out.println("Overriding In B");
	}
}


public class Qno_7 {
	public static void main(String[] args) {
		
		
		B obj = new B();
		obj.show();	
		System.out.println("Overloading "+B.add(3, 8));
		System.out.println("Overloading "+B.add(3.5,4.5));
	}

}
