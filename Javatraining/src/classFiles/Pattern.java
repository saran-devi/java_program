package classFiles;

public class Pattern {

	public static void main(String[] args) {
		
		String [][]str = new String[6][6];
		/*Pattern1*/
		System.out.println("Star Pattern");
		
		for (int row=0;row<str.length;row++) {
			for (int col=0;col<str.length; col++) {
				System.out.print("* ");
			}
			System.out.println('\n');
		}
		
		System.out.println('\n');
		/* Pattern2 */
		
		for (int i=0;i<str.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println('\n');
		}
       
		System.out.println('\n');
		
		/* Pattern3*/
		
		for(int i=0;i<str.length;i++) {
			for(int j=4;j>=i; j--) {
				System.out.print(" *");
				
			}
			System.out.println('\n');
		}
		
		/* pattern5 */
		System.out.println('\n');
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println('\n');
			
		}
		/*Pattern 6*/
		System.out.println('\n');
		for(int i=0;i<str.length;i++) {
			System.out.print(" ");
		for(int j=0;j<i;j++) {
				System.out.print(" * ");
			}
		}
		
		
	
		System.out.println('\n');
		}
		
		
	}


}
