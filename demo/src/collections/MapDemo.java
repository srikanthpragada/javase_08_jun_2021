package collections;

import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		var customers = new TreeMap<Integer, String>();
		
		customers.put(1,  "James");
		customers.put(3,  "Joe");
		customers.put(2,  "Andy");
		
		for(var id : customers.keySet())
			System.out.printf("%3d %s\n",id, customers.get(id));

	}

}
