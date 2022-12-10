package programs;

public class ToUpperCase {

	public static void main(String[] args) {
		char [] s = {'m','a','d','a','m'};
		System.out.println("An Uppercase for the given String:");
		System.out.print(toupper(s));
		
	}
	
	public static char[] toupper(char[] s) {
		
		char [] s1 = new char[5];       // initialize an empty array for storing the results.
		for(int i=0;i<=s.length-1;i++) {
		char a = (s[i]);                  //each character stored in a variable for converting to uppercase.
		
		char au = Character.toUpperCase(a); // after converting each character to uppercase stored in char variable.
		
		s1[i] = au; // store the converted character into new array.
	     
		}
		
		return s1;
		
	}

}
