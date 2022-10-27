package lambdaExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//interface Sayable{  
//    void say();  
//}  

//class Product {
//	int id;
//	String name;
//	float salary;
//
//	public Product(int id, String name, float salary) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//	}
//	
//
//}
//@FunctionalInterface
//interface Lambda{
//	
//	public void drive();
//
//	}
//
//public class LambdaExample {
//	public  void driverName() {
//		System.out.println("Drive by Harsha");
//	}
//
//	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		list.add("Hasrha");
//		list.add("Vardhan");
//		list.add("Hyderbad");
//		list.add("Ovaledge");
//		list.forEach((n) -> System.out.println(n));
//		Lambda l = (a,b) -> (a+b);{
//			System.out.println(l.add(5,5));
//		};
//		Lambda l2 =(a,b)->{
//			return (a+b);
//		};
//		System.out.println(l2.add(5, 5));
//		Lambda l = (drive) -> {
//			String str1 = "Welcome ";
//			String str2 = str1 + drive;
//
//			return str2;
//		};
//		System.out.println(l.drive("Harsha"));
//		Runnable run = new Runnable() {
//			@Override
//			public void run() {
//				System.out.println("Thread_1 running");
//			}
//		};
//		Thread t1 = new Thread(run);
//		t1.start();
//		
//		Runnable run2 = () -> {
//				System.out.println("Thread_2 running");
//			
//		};
//		Thread t2 = new Thread(run2);
//		t2.start();
//		List<Product> list = new ArrayList<Product>();
//		list.add(new Product(1, "hasrha", 25000f));
//		list.add(new Product(2, "vardhan", 45000f));
//		list.add(new Product(3, "ram", 15000f));
//		list.add(new Product(4, "sita", 35000f));
//		Stream<Product>  k = list.stream().filter(j-> j.salary>20000);
//		k.forEach(i->System.out.println(i));
//		Lambda l = LambdaExample::driverName;
//		l.drive();
//		LambdaExample le = new LambdaExample();
//		Lambda l = le::driverName;
//		l.drive();
//		
//		Lambda l2 = new LambdaExample()::driverName;
//		l2.drive();
//		
//	}
//
//}
//public class LambdaExample {  
//    public void saySomething(){  
//        System.out.println("Hello, this is non-static method.");  
//    }  
//    public static void main(String[] args) {  
//        LambdaExample methodReference = new LambdaExample(); // Creating object  
//        // Referring non-static method using reference  
//            Sayable sayable = methodReference::saySomething;  
//        // Calling interface method  
//            sayable.say();  
//            // Referring non-static method using anonymous object  
//            Sayable sayable2 = new LambdaExample()::saySomething; // You can use anonymous object also  
//            // Calling interface method  
//            sayable2.say();  
//    }  
//}  
class Java {
	Java(String str) {
		System.out.println("keyword " + str);
	}
}
interface Keyword {
	Java getKeyword(String str);
}

class LambdaExample {
	public static void main(String[] args) {
		Keyword key = Java::new;
		key.getKeyword("Harsha");
	}
}
