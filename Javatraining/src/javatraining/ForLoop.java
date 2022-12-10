package loopingDemo;

public class ForLoop {

	public static void main(String[] args) {
		
		/*
		 * for 
		 * while 
		 * do..while
		 */
		
		
		
		for ( int i = 1 ; i<=5 ; i++) {
			System.out.println("My name is Saranya");
		}
		
		/*
		 * System.out.println("My name is Saranya");
		 * System.out.println("My name is Saranya");
		 * System.out.println("My name is Saranya");
		 * System.out.println("My name is Saranya");
		 * System.out.println("My name is Saranya");
		 */
		
		// readability
		// maintainability
		
		for (int i = 1 ; i<=10 ; i++) {
			System.out.println("i: " + i);
		}
		
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
		
		
		int sum = 0; 
		
		for (int i = 1 ; i<=10 ; i++) {
			sum = sum + i;
			
		}
		System.out.println("Sum of first 10 natural numbers is : " + sum);
	
	
	
	for (int i = 10 ; i>0; i--) {
		System.out.println("i: " + i);
	}
	
	
	for (int i = 1 ; i<=15 ; i++) {
		System.out.println("15 * " + i + " = " + i*15);
	}
}}
