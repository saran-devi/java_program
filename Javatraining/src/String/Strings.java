package String;



public class Strings{

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//String s2 = sc.nextLine();
		//String first = s2.substring(0, 1).toUpperCase();
		//String second = s2.substring(1);
		//String rem = first + second ;
		//System.out.println(rem);
		//System.out.println();'
		
		String str = "welcome to java   class"; // Initialize the local variable 

		System.out.println(str.length());
		
		String firstHalf = str.substring(0, 15);
		String secondHalf = str.substring(15).trim();
		
		str = firstHalf+" "+secondHalf;
		
		
		System.out.println("The orginal string is: " + str); // printing the orginal statement 
		
		String[] caps = str.split("\s"); // split method is used to split the words according to space. actually it will skip the space.
		
		
		
		String captilizer = ""; //to store the result local variable initialize without any value.
		
		for(String cap : caps) {  
			
		String firstletter = cap.substring(0,1); // first letter in each word eg:w,t,j,c
		
		String secondletter = cap.substring(1);// remaining letter in each word eg:elcome,o,ava,lass.
		
		captilizer = captilizer + firstletter.toUpperCase() + secondletter + " "; //adding both first and second string with space. 
		// Begining captilizer is without any value, the w-caps adding to remainging elcome with space and store this to captilizer. same for second word etc
		// W+elcome+space =Welcome store in captilizer. 
		}
		System.out.println(captilizer);
		
		}
	
	
	

}
;