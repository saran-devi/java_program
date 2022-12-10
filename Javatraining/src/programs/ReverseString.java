package programs;

public class ReverseString {

	public static void main(String[] args) {
		
		reverseString();
		
		System.out.println();
		System.out.println("Reverse Words in a given sentence");
		System.out.println("________________________________");
		
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
	public static void reverseString() {
		
		System.out.println("Reverse within Reverse");
		System.out.println("**********************");
		
		String str = "This is java class";
		System.out.println(str);
		
		//String []s = str.split("\s");
		
		String ch = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			ch = ch+str.charAt(i);
		}
		System.out.println(ch);
	}
		

	}


