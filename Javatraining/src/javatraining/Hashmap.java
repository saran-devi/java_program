package javatraining; //collection framework

import java.util.HashMap;
import java.util.Map.Entry;

/*	collection - data structure
Collection - it's a root Interface of all Interfaces, a collection framework
Collections - a class which extends Object class, which has "sort" method   */

public class Hashmap {

	/*
	 * 
	 * ArrayList - it implements List Interface 
	 * HashSet - it implements Set Interface 
	 * HashMap - it implements Map Interface
	 * 
	 * ArrayList - allows duplicate elements 
	 * HashSet - it doesn't allow duplicate elements 
	 * HashMap - it doesn't allow duplicate elements, in Key
	 * 
	 * ArrayList - maintains insertion order 
	 * HashSet - it doesn't maintains insertion order 
	 * HashMap - it doesn't maintains insertion order
	 * 
	 * ArrayList - we can retrieve in the same order how we inserted the elements using get() method 
	 * HashSet - it returns in random order - there is NO get() method 
	 * HashMap - value is returned as the Map uses get(argument:Key) method
	 * 
	 * ArrayList - it allows multiple null values 
	 * HashSet - it allows only one null values 
	 * HashMap - it allows only one null values, in Key
	 * 
	 * ArrayList - for loop and ListIterator is used to traverse the list elements
	 * HashSet - Iterator can be used traverse the set elements 
	 * HashMap - for loop is used to traverse the Map elements
	 * 
	 */

	public static void main(String[] args) {

		// HashMap<K, V> K-Key, V-Value

		
		  HashMap<String, String> map = new HashMap<>();
		  
		  map.put("IN", "India"); 
		  map.put("UK", "United Kingdom"); 
		  map.put("CN","China"); 
		  map.put("AN", "China");
		  map.put("BN", "India"); 
		  map.put("CK", "United Kingdom"); 
		  map.put("DN","China"); 
		  map.put("EN", "China");
		  map.put("FN", "India"); 
		  map.put("HK", "United Kingdom"); 
		  map.put(null,"Germany"); 
		  map.put(null, "Butan");
		  System.out.println(map);
		  map.remove("HK");
		  System.out.println(map);
		  map.replace("FN", null);
		  System.out.println(map);
		  map.replace("EN", "China", "SriLanka");
		  System.out.println(map);
		  System.out.println(map.isEmpty());
		  System.out.println(map.containsKey("en"));
		  System.out.println(map.containsValue("China"));
		 // map.clear();
		  System.out.println(map);
		  
		  for (  Entry<String, String> m : map.entrySet() ) {
				  System.out.println(m.getKey() + "\t" + m.getValue()); 
				  }
				  
		HashMap<Integer, Employee> map1 = new HashMap<>();

		Employee e1 = new Employee(12, "Saranya", "Associate");
		Employee e2 = new Employee(13, "Hassain", "Associate");
		Employee e3 = new Employee(14, "Basha", "Associate");
		Employee e4 = new Employee(15, "BIX", "Associate");
		Employee e5 = new Employee(16, "Dinesh", "Associate");
		Employee e6 = new Employee(17, "Rakesh", "Associate");

		map1.put(101, e1);
		map1.put(102, e2);
		map1.put(103, e3);
		map1.put(104, e4);
		map1.put(105, e5);
		map1.put(106, e6);

		for (Entry<Integer, Employee> m : map1.entrySet()) {
			int key = m.getKey();
			Employee b = m.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.id + " " + b.name + " " + b.designation);

		}

	}

}
