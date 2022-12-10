package javatraining;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	/* for loop
	 * for each loop*/
	 
  /*ArrayList - it implements List Interface
	HashSet - it implements Set Interface
		
	ArrayList - allows duplicate elements
	HashSet - it doesn't allow duplicate elements
	
	ArrayList - maintains insertion order
	HashSet - it doesn't maintains insertion order
	
	ArrayList - we can retrieve in the same order how we inserted the elements using get() method
	HashSet - it returns in random order - there is NO get() method
	
	ArrayList - it allows multiple null values
	HashSet - it allows only one null values
	
	ArrayList - for each loop is used to traverse the list elements 
	HashSet - Iterator Object can be used to traverse the set elements
	
	*/
	
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("SuperMan");
		hs.add("AquaMan");
		hs.add("SpiderMan");
		hs.add("CaptainAmerica");
		System.out.println(hs);
		
		  hs.clear(); 
		  System.out.println(hs);
		 
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Jaya"));
		
		
		//System.out.println(hs);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(2);
		arr.add(2);
		arr.add(1);
		arr.add(2);
	
		
		System.out.println(arr);
		
		HashSet<Integer> hsInt = new HashSet<>();
		
		hsInt.add(2);
		hsInt.add(10);
		hsInt.add(1);
		hsInt.add(2);
		
		System.out.println(hsInt);
		
		HashSet<Integer> hsInte = new HashSet<>();
		
		hsInte.add(2);
		hsInte.add(2);
		hsInte.add(100);
		hsInte.add(1);
		hsInte.add(20);
		hsInte.add(null);
		hsInte.add(null);
		
		System.out.println(hsInte);
		
		HashSet<Integer> hsInteger = new HashSet<Integer>();
		
		hsInteger.addAll(hsInte);
		
		
		System.out.println(hsInteger);
		
		 Object[] arr1 = hsInteger.toArray();
		 
		 System.out.println(arr1);
		 
		 for (Object a : arr1) {
			 System.out.println(a);
		 }

		Iterator<Integer> I = hsInte.iterator();
		
		while (I.hasNext()) {
			System.out.println(I.next());
		}
					
	}
	
	
	

}
