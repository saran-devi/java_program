package javatraining;

import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		
		Scanner  scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.next();
		System.out.println("My name is " + name );
		
		System.out.println("Hi " + name + " enter your age: ");
		int age = scanner.nextInt();
		System.out.println("My age is " + age );
		
		
		System.out.println("Hi " + name + " enter your weight: ");
		int weight = (int) scanner.nextDouble();   //  ()  - round braces
		System.out.println("My weight is " + weight );
		
		double weightt = scanner.nextDouble();   //  ()  - round braces
		System.out.println("My weight is " + weightt );
		
		boolean isFishAlive = scanner.nextBoolean();
		System.out.println(isFishAlive);
		
		//scanner.close();
	
		// Scanner  sc = new Scanner(System.in);
		
		String a = scanner.next();
		System.out.println("a"+a);

	}

}
