package OOPs;

public class MeathodOverloading{
	
	public static int MyNum(int x, int y) { //MeathodOverloading 
		return x + y;
	}
	public static double  MyNum(double x,double y) {
		return x * y;
	}
	

	public static void main(String[] args) {	
		
			int addition = MyNum(5,10);
			double Multiply = MyNum(20.4,34.8);
			System.out.println("Addition of Two number: " +addition);
			System.out.println("Multiply of Two number: " +Multiply);
			
		}

}
