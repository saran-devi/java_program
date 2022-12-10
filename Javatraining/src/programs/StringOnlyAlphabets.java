package programs;

public class StringOnlyAlphabets {

	public static void main(String[] args) {
		
		System.out.println("Test case 1");
		
		String str = "World";
		
		System.out.println("Input: " +str);
		
		System.out.println("Output:" +isStringContainsAlphabtes(str));
		
	}
	
	public static boolean isStringContainsAlphabtes(String str) {
		
		return ((str != null) && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
		
	}

}
