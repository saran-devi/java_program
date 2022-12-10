package programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.next();
		
		String store = "";
		//for(String word:s) {
		for(int i=s.length()-1;i>=0;i--) {
			store = store + s.charAt(i);
		}
		//System.out.println(store + "  is");
		if(store.equals(s)) {
			System.out.println(store +"  is Palindrome");
		}
		else {
			System.out.println(store + " is Not Palindrome");
		}
		}
		
		
		

	}


