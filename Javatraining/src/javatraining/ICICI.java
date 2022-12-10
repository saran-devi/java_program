package oops.abstraction.Interface;

public class ICICI implements RBI {

	public final int fine = 600;

	public static void main(String[] args) {
		ICICI iC = new ICICI();
		double charges = iC.lateFee(1000);
		System.out.println(charges);
	}

	
	public double lateFee(int totalOutstanding) {
		double lateFee = totalOutstanding*baseInterestRate + fine;
		return lateFee;
	}
	

}
