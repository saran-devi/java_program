package classFiles;

public class Practice2 {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
		 String [][]star = new String[5][5];
		
		for(int i=0;i<star.length;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("*  ");
			}
			System.out.println(" \n ");
		}
		

	}
		

}
