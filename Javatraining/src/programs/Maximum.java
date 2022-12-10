package programs;

public class Maximum {

	public static void main(String[] args) {
		
		int[] a = {20,10,40,100,200};
		int result = maximum(a);
		System.out.println("The Maximum Number in Given Array:" +result);
		
	}
	
	public static int maximum(int[] a) {
		
		int max = 0; // Initializing  local variable for storing value.
		for(int i=0;i < a.length;i++) {
			if(a[i] > max) { //Check the value in array
				max = a[i]; // compare and store the maximum value 
			}
		}
		return max;
		
		
		
	}

}
