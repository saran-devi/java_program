package javatraining;

public class Day10 {

	/*
	 * Date : 09/20/2022 Author : Hassain Basha Topic : Single Dimensional Array
	 * & Multi- Dimensional Array 
	 * [5, 10, 15, 20, 25 ] - length of this array is 5 0 1 2 3 4 - index always starts with 0
	 */

	public static void main(String[] args) {
		
	  /*		
		int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 10;
		numbers[2] = 15;
		numbers[3] = 20;
		numbers[4] = 25;
		
		System.out.println(numbers[3]);
		
		System.out.println(numbers);
		
		for (int n : numbers) {
			System.out.println(n);
		}
		
		for (int i = 0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		
		int[] numeric = new int[5];
		
		for (int i = 0; i<numeric.length;i++) {
			System.out.print(numeric[i]+"\t");
		}
		
		for (int i = 0; i<numeric.length;i++) {
			numeric[i] = numbers[i];
		}
		System.out.print("\n");
		
		for (int i = 0; i<numeric.length;i++) {
			System.out.print(numeric[i]+"\t");
		}
		*/
		
		/*1			2			3
		(0,0)		(0,1)		(0,2)
		4			5			6
		(1,0)		(1,1)		(1,2)
		7			8			9
		(2,0)		(2,1)		(2,2)*/
		
		int[][] multi = new int[3][3];
		
		multi[0][0] = 1;
		multi[0][1] = 2;
		multi[0][2] = 3;
		multi[1][0] = 1;
		multi[1][1] = 2;
		multi[1][2] = 0;
		multi[2][0] = 1;
		multi[2][1] = 0;
		multi[2][2] = 0;
	
		
		System.out.println(multi);
//		System.out.println(multi[0][1]);
		
		/*
		 * for (int i = 0 ; i<multi.length;i++) { //0, 1, 2 for (int j = 0 ; j
		 * <multi.length; j++) { // 0, 1 , 2
		 * 
		 * System.out.print(multi[i][j]); } }
		 */
		
		
		
		int[][] num = new int[3][3];
		
		
		for (int i = 0; i<num.length; i++) {
			for (int j = 0; j<num.length-i; j++) {
			num[i][j] = multi[i][j];
			System.out.print(num[i][j]+"\t");
			
		}
		}
		
		
			System.out.println("\n");
		}
	 
			
	
		/*
		 * for (int i = 0; i<num.length; i++) { for (int j = 0; j<num.length; j++) {
		 * System.out.print(num[i][j]); } }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


