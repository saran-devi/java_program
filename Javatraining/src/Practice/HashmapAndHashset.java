package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;


public class HashmapAndHashset {

	public static void main(String[] args) {
		
		HashSet();
		System.out.println();
		//hashMap();
		
		
	}
	public static void HashSet() {
		
			HashSet<Integer> hi = new HashSet<Integer>();
			
			hi.add(2);
			hi.add(null); // only one null value allowed.
			hi.add(10);
			hi.add(20);
			hi.add(20); // it wont allow duplicate element.
			hi.add(null);
			
			
			System.out.println(hi);
			
			//System.out.println(hi.get(7)) it wont allow get method because it does not maintain insertion order.
			
			HashSet<Integer> hashInt = new HashSet<Integer>();
			hashInt.add(4);
			System.out.println(hashInt);
			hashInt.addAll(hi); //adding all element from hi to hashInt
			
			System.out.println(hashInt);
		
			
			Object[] arr1 = hashInt.toArray(); // It prints the Id of the arr1
			
			System.out.println(arr1);
			 
			for(Object a:arr1) { //  one way to traverse the list of element  is for each loop
				System.out.println(a);
			}
			
			System.out.println(hi);
			
			Iterator<Integer> I =hi.iterator(); // another way to traverse the list of element is  iterator.
			 
			while (I.hasNext()) {
				System.out.println(I.next());
			}
			
			
				
			}
			
			
	public static void hashMap() {
		
		//HashMap<k,v> k-key v-value
		
		HashMap<String,String> hm = new HashMap<>();
		
		hm.put("EN", "English"); // adding string by using put method which contain two parameter key and value
		hm.put("TS", "Tamil");
		hm.put("MA", "Maths");
		hm.put("SC", "Sceince");
		hm.put("SC", "Sceince"); // duplicate  element is not allowed.
		hm.put("SS","Social");
		hm.put(null,"Environmental");
		hm.put(null, "GeneralKnowledge"); // duplicate null value is not allowed.
		
		System.out.println(hm);
		
		System.out.println(hm.get("MA")); // get method is allowed by using key.
		
		//System.out.println(hm.remove)
		hm.remove("SC");
		System.out.println(hm);
		hm.replace("MA","Maths","Physics");
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		System.out.println(hm.containsKey("MA"));
		System.out.println(hm.containsValue("Tamil"));
		System.out.println(hm);
		
		/*for(Entry<String, String> m : hm.entrySet()) {              // enhanced for loop.
			System.out.println(m.getKey() + "\t" + m.getValue());
			//System.out.println(m);
			
		}*/
		HashMap<Integer, Employee> map = new HashMap<>(); // like String Integer Employee also class as a parameter for HashMap 
		// HashMap implements the map interface.
		
		Employee e1 = new Employee(1,"Saranya","23");
		Employee e2 = new Employee(2,"kavitha","24");
		Employee e3 = new Employee(3,"mani","22");
		Employee e4 = new Employee(4,"jansi","21");
		Employee e5 = new Employee(5,"jai","23");
		
		map.put(100, e1);
		map.put(101, e2);
		map.put(102, e3);
		map.put(103, e4);
		map.put(104, e4);
		
		for(Entry<Integer, Employee> m:map.entrySet()) { // enhanced for loop is used
			int key = m.getKey();                        // get method is used
			Employee e= m.getValue();
			System.out.println(key + "  Details");
			System.out.println(e.id + " " + e.name +" "+ e.age);
			
			
		}
		
		
		
	}

}
