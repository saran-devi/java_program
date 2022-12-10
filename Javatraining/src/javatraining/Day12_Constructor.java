package javatraining;

public class Day12_Constructor {

	/*
	 * Date : 09/23/2022 Author : Hassain Basha Topic : What is Constructor? and
	 * Method calling, Constructor Calling, Constructor Overloading
	 */

	public static void main(String[] args) {
		Day12_Constructor c = new Day12_Constructor();
		Day12_Constructor c2 = new Day12_Constructor("Hassain");
		Day12_Constructor c3 = new Day12_Constructor("Hassain", "Basha");
		Day12_Constructor c4 = new Day12_Constructor("Hassain", 14);
		Day12_Constructor c5 = new Day12_Constructor(14, "Hassain");
	
	}


	Day12_Constructor() {
		System.out.println("I am a default constructor");
	}
	
	Day12_Constructor(String name) {
		System.out.println("I am a parameterized constructor : " + name );
	}
	
	Day12_Constructor(String name, String city) {
		System.out.println("I am a parameterized constructor : " + name  + " | city : " + city);
	}
	
	Day12_Constructor(String city, int birthDate) {
		System.out.println("I am a parameterized constructor : " + city + " | birthDate : " + birthDate);
	}
	
	Day12_Constructor(int birthDate, String city) {
		System.out.println("I am a parameterized constructor : " + birthDate + " | city : " + city );
	}
	
	
	}
