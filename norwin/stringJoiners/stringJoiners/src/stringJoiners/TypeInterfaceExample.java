package stringJoiners;

class GenericClass<X>{
	X name;

	public X getName() {
		return name;
	}

	public void setName(X name) {
		this.name = name;
	}
	public String genericMethod(GenericClass<String> x) {
		x.setName("Harsha");
		return x.name;
	}
}
public class TypeInterfaceExample {

	public static void main(String[] args) {
		GenericClass<String> genericClass = new GenericClass<String>();
		genericClass.setName("Vardhan");
		System.out.println(genericClass.getName());
		System.out.println(genericClass.genericMethod(genericClass));
		String str= genericClass.genericMethod(new GenericClass<String>());
		System.out.println(str);
	}

}
