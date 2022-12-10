package javatraining;

public class Day8 {
	
	static boolean a = false;   // global variable - instance and static
	
	/* default value of Global Variable
	 * int = 0 double = 0.0 String = null boolean = false
	 */	
	public static int addition(int a, int b) {
		//System.out.println("a value within addition(): " + (a * b));
		//System.out.println("b value within addition(): " + b);
		int c = a + b ;
		return c;
	
	}
	
	public static void main(String[] args) {
		
		int sum = addition(5, 6);
		
		System.out.println("sum: " + sum);
		
		
		int saran = 0;
		for (int bix = 1 ; bix < 10 ; bix++ ) {
		//	addition(5, 6);
		}
		// dataType variableName = value;
		
		int age = 10; // declaration and initialization
		
		/*
		 * 
		 */
		int a; String b; double c;
		int x; String y; double z;
		int e,f,g;
		
		e = f = g = 40;
		
		System.out.println("e: " + e);
		System.out.println("f: " + f);
		System.out.println("g: " + g);
		
		age = 20;
		
		System.out.println(age);
		
		age = 30;
		
		System.out.println(age);
		
		//int a;  //  declaration and
		 a = 10 ; // initialization
		 
		System.out.println(a);

	}
	/* - method 
	 * - passsing parameters 
	 * - return type 
	 * - how to use returned values 
	 * - scope definition 
	 * - local variable
	 * - global variable
	 * - instance variable
	 * - static variable
	 */
	
	
}
