package oops.polymorphism;
/*
 * Date   : 09/29/2022
 * Author : Hassain Basha
 * Topic  : Polymorphism 
 * 			There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. 
 * 			We can perform polymorphism by method overloading and method overriding.
 *  
 * 			Method overriding occurs when a subclass (child class) has the same method as the parent class.
 * 
 * 			Rules for Method Overriding:
 * 			1.	Both the superclass and the subclass must have the same method name, the same return type and the same parameter list.
 * 			2.	There must be an IS-A relationship (inheritance).
 * 			
 * 			Things to remember:
 * 			3.	We cannot override the method declared as final and static. 
 * 				If we don’t want a method to be overridden, we declare it as final.
 * 			4.	It is important to note that constructors are not inherited. Hence, there is no such thing as constructor overriding in Java.
 * 			5.	However, we can call the constructor of the superclass from its subclasses. For that, we use super().
 * 			6.	The same method declared in the superclass and its subclasses can have different access specifiers. However, there is a restriction.
 * 			7.	We can only use those access specifiers in subclasses that provide larger access than the access specifier of the superclass. For example, 
 * 			8.	Suppose, a method myClass() in the superclass is declared protected. 
 * 				Then, the same method myClass() in the subclass can be either public or protected, but not private.
 * 
 * 			Can we override static method? Answer is NO.
 * 			Can we override java main method? Answer is NO.
 * 			Can we access the method of the superclass after overriding? Answer is YES = use the "super" keyword.
 * 			Is private methods are overridden? Answer is NO.
 * 				
 */

public class Child extends Parent {

	public void subtraction() {
		System.out.println("num3 = " + --num3);
	}

	public static void main(String[] args) {
		
		Child ch = new Child();

		ch.subtraction();
		ch.addition();
		ch.num3 = 10;
		ch.addition();

		Parent pa = new Parent();
		pa.addition();
		
		Parent pc = new Child();
		pc.addition();

	}

	public void addition() {
	//	super.addition();
		System.out.println("I am in child method");
	}

}
