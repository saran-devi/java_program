package javatraining;


import java.util.ArrayList;
import java.util.Collections;

/*	collection - data structure
	Collection - it's an root Interface of all Interfaces, a collection framework
	Collections - a class which extends Object class, which has "sort" method   */

public class Arraylist {

	public static void main(String[] args) {
		
	/*	int a = 2;
		a = 5;
		a = 6;
		System.out.println("a:" +a);
	
			//Array   - size fixed
			int [] arr = new int[5];
			arr[0] = 2;
			arr[4] = 2;
			arr[4] = 5;
			arr[5] = 2;
			//ArrayList - expand/reduce
			
			for (int x : arr) {   // enhanced for loop
				System.out.println(x);
			}
*/			
			/*
			 * for (int i = 0 ; i < arr.length ; i++) 
			 * { 
			 * 		System.out.println(arr[i]); 
			 * }
			 */
			
		//		Wrapper Class
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(2);			// 9 100 7 2 20 10 2 1 2
		arr.add(20);
		arr.add(10);
		arr.add(2);
		arr.add(1);
		arr.add(2);
		arr.add(0, 100);
		arr.add(0, 9);
		arr.add(2, 7);

		// arr.add(0, null);  null is not allowed as type is Integer
		
		System.out.println(arr);
		
		for (int a : arr) {   // enhanced for loop
			System.out.println(a);
		}
		
		//arr.clear();
		
		System.out.println(arr);
		
		System.out.println(arr.contains(10));
		
		System.out.println(arr);
		
		System.out.println(arr.remove(0));
		
		System.out.println(arr);
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		arr2.add(99);    // 99
		
		System.out.println(arr2);
		
		arr2.addAll(0, arr);
		
		
		System.out.println(arr2);	// [100, 7, 2, 20, 10, 2, 1, 2, 99]
		
		//arr.add(null);
		//arr.add(0, null);
		//arr.add(null);
		System.out.println(arr);
		
		System.out.println(arr.containsAll(arr2));
		System.out.println(arr2.containsAll(arr));
		
		System.out.println(arr.get(7));
		System.out.println(arr.isEmpty());
		
		System.out.println(arr.subList(0, 2));
		
			
		System.out.println("Before Sorting : " + arr);
		Collections.sort(arr);
		System.out.println("After Sorting : " + arr);
		
		
		ArrayList<String> arr3 = new ArrayList<String>();
		arr3.add("Super Man");
		arr3.add("Spider Man");
		arr3.add("Aquaman");
		
		System.out.println(arr3.subList(0, 2));
		
		System.out.println("Before Sorting : " + arr3);
		Collections.sort(arr3);
		System.out.println("After Sorting : " + arr3);
		
		System.out.println(arr3.contains("Spider Man"));
		
		System.out.println(arr3.get(2));
		System.out.println(arr3.isEmpty());
		
		System.out.println(arr3.subList(0, 2));
		
		for (String arjun : arr3) {   // enhanced for loop
			if (arjun.contains("Aqua")) {
				System.out.println(arjun);
			}
		}
		}

	}


