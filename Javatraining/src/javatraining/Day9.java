package javatraining;

public class Day9 {

	/*
	 * Date : 09/19/2022 Author : Hassain Basha Topic : Single Dimensional Array [
	 * 5, 10, 15, 20, 25 ] - length of this array is 5 0 1 2 3 4 - index always
	 * starts with 0
	 */

	public static void main(String[] args) {
		int a = 100;
		int[] numbers = { 6, 10, 15, 20, 25 };
		// int []numbers = {5, 10, 15, 20, 25};
		// int numbers[] = {5, 10, 15, 20, 25};

		double[] weightOfBabies = { 2.2, 3.5, 3, 4.15, 4.5 };

		String[] countries = { "India", "SriLanka", "Pakistan", "China", "Bangladesh" };

		char[] letters = { 'a', 'b', 'c', 'd', 'e' };

		System.out.println(a);
		System.out.println(numbers.length);
		System.out.println(numbers[0]);
		System.out.println(numbers[4]);
		System.out.println(weightOfBabies.length);
		System.out.println(countries.length);
		System.out.println(countries[1]);
		System.out.println(letters.length);
		
		for (String country:countries) {
			System.out.println(country);
		}
		
		// for-each loop (or) enhanced for loop
		
		for (int num:numbers) {
			System.out.println(num);
		}
		
		for (double weight : weightOfBabies) {
			System.out.println(weight);
		}
		
		System.out.println("**************************");
		
		for (int i = 0 ; i < numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("**************************");
		for (int i = 0 ; i < countries.length ; i++) {
			System.out.println(countries[i]);
		}
	}

}
