package javatraining;
/*
 * Date   : 09/26/2022
 * Author : Hassain Basha
 * Topic  : Inheritance - Code Re-usability, Maintainability
 * Single Level
 * Multi Level
 * Hierarchical
 * MultipleInheritance - can achieved using Interface
 */

public class Day13_Child extends Day13_Parent {

 
	public static void subtraction() {
		System.out.println("num3 = " + --num3);
	}
	
	public static void main(String[] args) {
		
		subtraction();
		addition();
		num3=10;
		addition();
	}

}
