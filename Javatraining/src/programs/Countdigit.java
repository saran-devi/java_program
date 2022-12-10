package programs;

public class Countdigit {

	public static void main(String[] args) {
		
		int n = 3234;
		System.out.println("The count of  positive integer:" +CountDigit(n));
		

	}
	
	public static int CountDigit(int n) {
		
		int i=0;
		while (n!=0) {
			n = n/10;
			i++;
		}
		return i;
		
	}

}
