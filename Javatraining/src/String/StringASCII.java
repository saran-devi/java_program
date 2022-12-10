package String;



/*Get the string
Match the string: 
Check if the string is empty or not. If empty, return false
Check if the string is null or not. If null, return false.
If the string is neither empty nor null, then check the string characters one by one for alphabet using ASCII values.
Return true if matched */

public class StringASCII {
	
	public static void main(String[] arg) {
		
		System.out.println("Test case 1");
		
		 
		String str1 = "Welcome";
		
		System.out.println("Input: " +str1);
		System.out.println("Output:" +StringValidateAscii(str1));
		
		System.out.println("Test case 2");
		
		String str2 ="  selenium";
		System.out.println("Input:" +str2);
		System.out.println("Ouptput: " +StringValidateAscii(str2));
		
		
	}
	
	public static boolean StringValidateAscii(String str) {
		
		if(str == null || str.equals("")) {
			
			return false;
		}
		
		//iterating as now we encounter string using lenght() method
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
		//checking anyother alphats present in string
			
			
			if ((!(ch >='A' && ch <= 'Z')) && (!(ch >= 'a' && ch <= 'z'))) {
				
				return false;
			}
			
		}
		return true;
		
	}

}
