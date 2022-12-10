package oops.abstraction.Interface;

import java.util.Scanner;

public class SBI implements RBI{
	
	static Scanner sc = new Scanner(System.in);
	public final int fine = sc.nextInt();
	static int oustandingAmount = sc.nextInt();  

	public static void main(String[] args) {
		SBI s = new SBI();
		
		double charges = s.lateFee(oustandingAmount);
		System.out.println(charges);
	}

	
	public double lateFee(int totalOutstanding) {
		double lateFee = totalOutstanding*baseInterestRate + fine;
		return lateFee;
	}
	
	

}
