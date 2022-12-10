package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx {

	public static void main(String[] args) {
		
		//arrayListOnInteger();
		arrayListOfString();
		
		
	}
	public static void arrayListOnInteger() {
		System.out.println("Array List on Integer");
		System.out.println("**********************");
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(20); //0
		arr.add(30); //1
		arr.add(40); //2
		arr.add(60); //4
		arr.add(70); //6
		arr.add(3,50);//3
		arr.add(5,80);//5
		//arr.add(3,null);
		
		System.out.println("Array List");
		System.out.println("It will prints like a list");
		System.out.println(arr);
		
		System.out.println();
		System.out.println("Prints one by one");
		
		/*for(int a:arr) {  // display the value one by one
			System.out.println(a);
		
		}*/
		System.out.println();
		//arr.clear() which clear all the element in the list.
		
		System.out.println(arr.contains(80)); // returns boolean value check no presents or not.
		
		System.out.println();
		
		System.out.println(arr);
		
		System.out.println(arr.remove(1));
		
		System.out.println("After removing the element");
		System.out.println(arr);
		
		System.out.println();
		
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		 arr2.add(1);
		 arr2.add(2);
		 arr2.add(3);
		 arr2.add(4);
		 arr2.add(5);
		 
		 System.out.println("The arr Array List:"+ arr);
		 System.out.println("The arr2 Array List:"  + arr2);
		 
		 System.out.println(arr.containsAll(arr2)); //It shows the boolean value check the arr with arr2 element.
		 
		 System.out.println();
		 System.out.println(arr2);
		 
		 System.out.println();
		 arr2.addAll(arr); // add all the element from arr to arr2.
		 System.out.println(arr2);
		 
		 arr.add(2,null); // add null in 2nd index
		 System.out.println(arr);
		 
		 System.out.println(arr.get(6)); // get the 7th index number
		 System.out.println(arr.isEmpty()); // return boolean value
		 
		
		 System.out.println(arr);
		 System.out.println(arr.subList(0, 3)); // zero index and remove from 1st index.
		 
		 System.out.println(arr.remove(2));
		 
		 System.out.println("Before Sorting:" +arr);
		 Collections.sort(arr);
		 System.out.println("After Sorting:" +arr);
		 
		 System.out.println("*****************************************");
		 
		 
	}
	public static void  arrayListOfString() {
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("java class");
		arr.add("welcome to class");
		arr.add("software");
		arr.add("hardware");
		
		System.out.println(arr.subList(0,2));
		System.out.println(arr);
		
		System.out.println("Before Sorting" +arr);
		
		Collections.sort(arr);
		
		System.out.println("After Sorting" +arr);
		
		System.out.println();
		
		System.out.println(arr.contains("System"));
		
		System.out.println();
		
		System.out.println(arr.get(0));
		System.out.println();
		
		System.out.println(arr.isEmpty());
		System.out.println();
		
		for(String s:arr) {
			if(s.contains("hard")) {
			System.out.println(s);
			}
		}
		
		
	}

}
