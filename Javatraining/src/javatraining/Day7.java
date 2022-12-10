package javatraining;

public class Day7 {

	public static void main(String[] args) {

		// WAP in Java to display the first 10 natural numbers

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// WAP in Java to find sum of the first 10 natural numbers
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of the first 10 natural numbers is : " + sum);

		// WAP in Java to display the multiplication table of given Integer : 15

		for (int i = 1; i <= 15; i++) {
			System.out.println("15 * " + i + " = " + i * 15);
		}

	}
}
