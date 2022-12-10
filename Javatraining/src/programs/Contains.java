package programs;

public class Contains {

	public static void main(String[] args) {
		
		
		int[] a = {1,2,3,4,5,8};
		int x = 1;
		boolean result = contains(a,x);
		System.out.println(result);
	
	}

	 public static boolean contains(int[] a, int x ) {
		for (int i = 0;i<=a.length-1;i++) {
			if(a[i]==x) {                  //checking the list of each element with the x.
				
				return true;			   // if element it present return true. 
			   }
			}
		return false;                      // after checking each and every value it will come out of loop.
		
		
		 
	 }
}
