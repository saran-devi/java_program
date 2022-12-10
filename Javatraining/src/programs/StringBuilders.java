package programs;

public class StringBuilders {

	public static void main(String[] args) {
		
		String str = "This is java class";
		
		/*Scanner sc = new Scanner(System.in);  The problem here is we cannot give in scanner because it split the word only siht will print 
		
		System.out.println("Enter the String:");
		String str = sc.next();*/
		
		
		String[] words = str.split("\s");
		
		String reverseWord ="";
		
		for (String w :words ) 
		{
			StringBuilder sb = new StringBuilder(w);// it creates the empty string builder with initial capacity of 16
			sb.reverse();
			
			reverseWord = reverseWord + sb.toString()+ " ";
			
		}
		System.out.println(reverseWord);

	}

	

}
