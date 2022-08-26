package maps;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

class Student{
	int id;
	String name;
	public Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return "Id : "+id+"  "+"name : "+name;
	}
}
public class Maps {

	public static void main(String[] args) {
		Map <Integer,Student> map = new HashMap<Integer,Student>();
		Student obj = new Student(1,"Harsha");
		Student obj1 = new Student(2,"Vardhan");
		Student obj2 = new Student(3,"Ram");
		Student obj3 = new Student(4,"Sita");
		map.put(1, obj);
		map.put(2, obj1);
		map.put(3, obj2);
		map.put(4, obj3);
		Iterator<Entry<Integer, Student>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}
}
