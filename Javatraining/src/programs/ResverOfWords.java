package programs;

public class ResverOfWords {
	
	public static void main(String[] args) {
		
		printMessage();	
		reverseWholeString();
		
        }
	public static void printMessage() {
		System.out.println("Reverse Each word in Given a String");
		System.out.println("*********************************");
	
		String str = "This is java class";
		System.out.println(str);
		
		String [] word = str.split("\s"); // splitting string into four parts
		
		String afterReverse = "";// to store the string after reverse 
		
		for (String w:word) { // reading each words eg:this
			
			String reverseword = ""; // for storing each reversed word, empty variable declared
			
			for(int i=w.length()-1;i>=0;i--) {
				reverseword = reverseword+w.charAt(i); //siht
				
			}
			afterReverse = afterReverse + reverseword + " "; 
		
		}
		System.out.println(afterReverse);
		System.out.println();
		
	}
	
	
	public static void reverseWholeString() {
		
	System.out.println("Reverse Words in a given sentence");
	System.out.println("**********************************");
	
	System.out.println();
	
	String str = "A picture is worth a thousand words";
	
	String[] s = str.split("\s");
	
	//Orginal String
	for(int i=0;i<s.length; i++) {
		System.out.print(s[i]+" ");
		
	}
	//Reverse String 
	System.out.println();
	for(int i=s.length-1;i>=0;i--) {
	
		System.out.print(s[i]+" ");
	}

	}
	
	
}
	
		
		


