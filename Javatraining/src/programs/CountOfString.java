package programs;

public class CountOfString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CountOfString
		String s = "This Is Java  Training";
	
		System.out.println("The Given String is:" +s);
		int count=1;
		for (int i=0;i<s.length()-1;i++) {//Total length 20
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
			count++;
			
		}
		System.out.println("The Number of String is:" +count);
		 
		

	}

}
