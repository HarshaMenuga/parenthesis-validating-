package maps;

import java.util.Map;
import java.util.TreeMap;

public class Trees {

	    public static void main(String[]args) {	    
	    Map<Integer,String> tm=new TreeMap<>();
	     tm.put(1, "Hasrha");
	     tm.put(2, "Vardhan");
	     tm.put(3, "Ram");
	     tm.put(4, "sita");
	     System.out.println("treemap1 values: "+tm);
	     Map<Integer,String> tm1=new TreeMap<>();
	     tm1.put(5, "hi");
	     tm1.put(6, "hello");
	     System.out.println("treemap2 values :"+tm1);
	     tm1.putAll(tm);
	     System.out.println("after adding tree1 and tree2 values :"+tm1);
	     tm.containsKey(1);
	     System.out.println(tm.containsKey(1));
	     tm.containsKey(7);
	    System.out.println(tm.containsKey(7));

	    
	    
	    }
	}

