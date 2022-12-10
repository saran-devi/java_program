package Practice;

import java.util.Scanner;

public class Exercis1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Printing name
		
		/*String s = "Hello";
		System.out.println(s);
		System.out.println("Saranya Devi");
		or*/
		System.out.println("Hello\nSaranya Devi");
		
		//Sum of Two number
		
		System.out.println("The sum of two numbers:" + (30+45));
		System.out.println("the Division of:"+ (50/3));
		System.out.println("Calculation of:" +(-5+8*6));
		System.out.println("The second cals:"+(20+(-3*5)/8));
		System.out.println("Most operators:" +(5+15/3*2-8%3));
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input First number:");
		int no1 =sc.nextInt();
		System.out.println("Input Scond number:");
		int no2=sc.nextInt();
		/*int res1=no1+no2;
		int res2=no1-no2;
		int res3=no1*no2;
		int res4=no1/no2;
		int res5=no1%no2;*/
		System.out.println(no1 + "+" +no2+ "=" +(no1+no2));
		System.out.println(no1 + "-" + no2 + "="+ (no1-no2));
		System.out.println(no1 + "*" + no2 + "=" + (no1*no2));
		System.out.println(no1 + "/" + no2 + "=" + (no1/no2));
		System.out.println(no1 + "%" + no2 + "=" + (no1%no2));
		System.out.println("Enter first  number:" );
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		
		int res = num1 + num2;
		System.out.println("The sum of two numbers:" +res);
		
		
		
		
	}

}
