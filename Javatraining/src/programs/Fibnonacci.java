package programs;

import java.util.Scanner;

public class Fibnonacci {

	public static void main(String[] args) {
		
		
		int num = 150, t1 = 0, t2=1;
		
		System.out.println("The Fibonacci Series:" +num);
		
		while(t1<=num)  // for loop or if loop is not used in this scenario
		
		{
			
			System.out.print(  t1 + "+");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		/*
			 t1=1,t2=1 sum=2
			 t1=1,t2=2 (t1+t2=sum)  sum is 3
			 t1=2,t2=3 sum =5
			 t1=3,t2= 5,sum = 8
			 t1=5,t2=8 sum=13 .....
			 */
			   
		}
				
		
	}

}
