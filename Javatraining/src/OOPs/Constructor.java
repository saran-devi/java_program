package OOPs;

public class Constructor {
	int num1;
	int num2;
	int result;
	

	
	Constructor(){ 
		num1 = 10;
		num2 = 20;
		result = num1 + num2;
		}
	void display () {
		System.out.println("The result: " +result);
	}
	
	
	Constructor(String name){         // constructor overloading
		System.out.println("The users name is: " +name);
	}
	public static int MyNum(int x,int y) {
		return x+y;
	}
	public static double MyNum(double x, double y) {
		return x*y;
	}
	
	


public static void main(String[] args) {
	
	Constructor user = new Constructor(); // default constructor
	user.display();
	
	Constructor user1 = new Constructor("Saranya"); // parameterized constructor
	
	int addition = MyNum(4,5);
	System.out.println("The addition of Two number: " +addition); 
	
	double multiply = MyNum(30.2,4.8);
	System.out.println("The Mulitply of Two Numbers: " +multiply); //  Method Overloading
	

}
}
