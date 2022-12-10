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

public class Day13_Child2 extends Day13_Parent {

 
	public static void multiplication() {
		System.out.println("num3 = " + --num3);
	}
	
	public static void main(String[] args) {
		multiplication();
		addition();
		num3=10;
		addition();
	}

}
