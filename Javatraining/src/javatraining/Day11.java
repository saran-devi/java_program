package javatraining;

public class Day11 {
	
/*	1	2	3	4
 * 	
	1	2
	
	*/
	
	// java pattern programs
	
	public static void main(String[] args) {
		
		String [][] array = new String [4][4];	
		array[0][0] = "*";
		array[0][1] = "*";
		array[0][2] =  "*";
		array[0][3] =  "*";
		
		
		array[1][0] = "*";
		array[1][1] =  "*";
		
		array[2][0] = "*"; 
		
		for (int i = 0 ;  i < array.length ; i++) {  //   i = 0, j = 3 | i = 1, j = 2 | i = 2, j =1
			for (int j = 0 ; j < array.length-i*2 ; j++) {
				System.out.print(array[i][j] + "\t");
		}
			System.out.print("\n");
	}
	}
}
