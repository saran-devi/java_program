package oops.abstraction.Interface;

public class IndianBank implements RBI {

	public final int fine = 300;

	public static void main(String[] args) {
		IndianBank ib = new IndianBank();
		double charges = ib.lateFee(1000);
		System.out.println(charges);
	}

	
	public double lateFee(int totalOutstanding) {
		double lateFee = totalOutstanding*baseInterestRate + fine;
		return lateFee;
	}
	

}
