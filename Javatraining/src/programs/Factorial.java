package programs;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number: ");
		int num  = sc.nextInt();
		int factorial = fact(num);
		System.out.println("The Factorial of given number is:" +factorial);
		
		
	}
	public static int fact(int  n) {
		
		if(n==1) {
			return 1;
		}else {
			int num = fact(n-1)*n; // recursion  function calling itself.
			return num;
		}
	}

}
