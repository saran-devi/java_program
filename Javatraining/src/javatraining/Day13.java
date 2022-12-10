package javatraining;

/*
 * Date : 09/24/2022 
 * Author : Hassain Basha 
 * Topic : OOPS - Object, Class, Inheritance, Encapsulation, Polymorphism, Abstraction
 */

public class Day13 {

	int age;
	String name;

	public static void main(String[] args) {

		// object creation
		// create an object

		Day13 a = new Day13();

		System.out.println(a.age);
		System.out.println(a.name);

		a.age = 10;
		a.name = "Rakesh";

		System.out.println(a.age);
		System.out.println(a.name);

		Day13 b = new Day13();

		System.out.println(b.age);
		System.out.println(b.name);

		Day13 c = new Day13();

		System.out.println(c.age);
		System.out.println(c.name);

		displayInfo();

	}

	public static void displayInfo() {
		displayKYC();
	}

	public static void displayKYC() {

	}
}
