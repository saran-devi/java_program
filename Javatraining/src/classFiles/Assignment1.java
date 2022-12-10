package classFiles;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println(s1.substring(0).toUpperCase());
		
		
		String s2 = sc.nextLine();
		String first = s2.substring(0, 7).toUpperCase();
		String second = s2.substring(7);
		String rem = first + second ;
		System.out.println(rem);
		System.out.println();
		
		String s3 = sc.nextLine();
		System.out.println(s3.substring(0).toLowerCase());
		
		String s4 = sc.nextLine();
		
		
		
	}

}
