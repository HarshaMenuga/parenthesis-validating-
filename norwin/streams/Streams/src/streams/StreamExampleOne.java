package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product{
	int id;
	String name;
	float cost;
	public Product(int id, String name, float cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
}
public class StreamExampleOne {
	
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"Shoe",500f));
		list.add(new Product(2,"Shirt",1500f));
		list.add(new Product(3,"Sandals",2500f));
		list.add(new Product(4,"jeans",3500f));
		list.add(new Product(5,"T-Shirt",1500f));
		
		List<Float> cost = list.stream().filter(p->p.cost>500).map(p->p.cost).collect(Collectors.toList());
		
//		for(Product product:list) {
//			if(product.cost>500) {
//				cost.add(product.cost);
//			}
//		}
		list.forEach(products->System.out.println(products.cost));
		list.forEach(products->System.out.println(products.name));
		list.stream().forEachOrdered(p->System.out.println(p.id));
		Map<Integer,String> map = list.stream().collect(Collectors.toMap(p ->p.id, p->p.name));
		System.out.println(map);
		long count = list.stream().count();
		System.out.println(count);
		Float totalPrice = list.stream().map(product->product.cost).reduce(0.0f,(sum,price)->sum+price); // using reduce method
		float tp = list.stream().map(product->product.cost).reduce(0.0f,Float::sum); // Using Method Reference
		System.out.println(totalPrice);
		System.out.println(tp);
		double tp1 = list.stream().collect(Collectors.summingDouble(product->product.cost)); // Using collectors
		System.out.println(tp1);
		Double avg = list.stream().collect(Collectors.averagingDouble(p->p.cost));
		System.out.println("Average :"+avg);
		Long count1 = list.stream().collect(Collectors.counting());
		System.out.println(count1);
	}
}
