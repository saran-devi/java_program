package programs;

public class Equals {

	public static void main(String[] args) {
		
		int[] a1 = {3,2,3};
		int[] a2 = {1,2,3,4,5};
		boolean res = equals(a1,a2);
		System.out.println("Is The value,position and length of two array are same :" +res);
		
		
	}
  public static boolean equals(int[] a1,int[] a2){
	  
	  
	  		 if(a1.length==a2.length) {     // check both length of array if both array equal.
	  			 
	  			 for(int i=0;i<=a1.length-1;i++) { // check for each element in both array.
	  				
		  			 if(a1[i]!=a2[i]) {   // not equal return false 
						  
						  return false;
					  }
		  			 
				  }
	  			 
	  		}
	  		else return false; // if both length is not equal return false with out entering into the loop
	  		
	  		return true; // return true once satisfied all condition.
	 }
	  
}
