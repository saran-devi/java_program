package programs;

/*
 * Date   : 09/27/2022
 * Author : Hassain Basha
 * Topic  : Polymorphism - Many forms, Compile Time Polymorphism, Different ways of Method Overloading, 
 * 			Return Type, Type promotion, Type Conversion, 
 * 			Char type  & ASCII
 * 			Can we overload by return type? Answer: We can't.
 */



public class Calculator_MethodOverloading {
	
	
	
	int a;
	int b;
	int c;
	

	public static void main(String[] args) {
		
		Calculator_MethodOverloading calc = new Calculator_MethodOverloading();
		int d = calc.add();	
		System.out.println("c: " + d);
		
		int addition = calc.add((int) 10.5); 
		System.out.println("addition: " + addition);
		  calc.add("007", 007); 
		  calc.add(007, "jamesbond");  
		 // String plus = calc.add(1); //type promotion
		//  System.out.println("plus: " + plus);
		  
		 int sum = calc.add(5, 8);
		 System.out.println("sum of 5 + 8 is : "+sum);
		 
		 char alphabet = calc.charValidation('a');
		 System.out.println("alphabet:"+alphabet);
		 
	
		/*
		 * method overloading
		 * method overriding
		 */
		
	}
	
	public char charValidation(char character) {
		return character;
	}

	
	public int add() {
		c = a + b;
		// System.out.println("c: " + c);
		return c;
	}
	
	
	
	  public int add(int a) { 
		  c = a + b; 
		  System.out.println("a: " + a); 
		  return c;
		  }
	 
	
	/*
	 * public String add(double a) { double c; c = 10+20; return "c"; }
	 */
	
	public int add(int a, int b) {
		c = a + b;
		System.out.println("c: " + c);
		return c;
	}
	
	public void add(int a, String b) {
		String c;
		c = a + b;
		System.out.println("c: " + c);
	}
	
	public void add(String a, int b) {
		String c;
		c = a + b;
		System.out.println("c: " + c);
	}
	
	
	
	
	// following three scenarios will be eligible for method overloading concept
	

	/*
	 * public static int add() { c = a + b; // System.out.println("c: " + c); return
	 * c; }
	 */
	
	/*
	 * private int add() { c = a + b; // System.out.println("c: " + c); return c; }   
	 */
	
	/*
	 * public char add() { c = a + b; // System.out.println("c: " + c); return c; }
	 */
	
	
	
}
