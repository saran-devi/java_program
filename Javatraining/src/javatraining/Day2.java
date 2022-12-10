package javatraining;

public class Day2 {

	public static void main(String[] args) {
		
		//  primitive | non-primitive(reference datatypes)
		
		// 8 diff primitive datatypes
		
		/*		char		2 bytes	a single character ''  within single quotes		
				byte        1 byte	Integer ( a whole number family)							-128 to 127
				short		2 bytes	Integer ( a whole number family)
				int			4 bytes	Integer ( a whole number family)
				long		8 bytes	Integer ( a whole number family)
				float		4 bytes	Decimal ( a fractional number family)
				double		8 bytes Decimal ( a fractional number family)
				boolean		1 bit	true || false		*/
				
		int age = 10;
		char initial = 'm';
		float weightInKg= 80.5f;
		boolean isWaterHot = false;
		long mobileNumber = 9790488338L;
		String name ="1947";
		
		System.out.println(name);
		
		/*Non-primitive Types
		 * String
		 * Arrays
		 * Classes
		 * Interface
		 */
		
		
		/* TypeCasting
		 * Widening - small to big (automatically gets converted)
		 * Narrowing - big to small (manual)
		 */
		
		int num = 9;
		double weight = num;
		
		System.out.println(num);
		System.out.println(weight);
		
		
		double weightt = 80.5756d;
		int numm = (int) weightt;
		
		System.out.println("************************************");
		System.out.println(weightt);
		System.out.println(numm);
		
	}

}
