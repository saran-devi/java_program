package programs;

import java.util.Scanner;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countString();
		
	}
	
public static void countString() 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	String s = sc.nextLine();
	

	int s1 = s.length();
	System.out.println("The total number of String is:" +s1);
	
}
/*public static void occuranceString(string[] st,string str)
{
	//String str = "maddam";
	
	for(int i = 0;i<=str.length()-1;i++) {
		
	}*/
	


}
