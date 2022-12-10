package classFiles;



public class Captial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s;
		
		

	}
   public String Capital(String s) {
	    //String s;
		String s1 = s.substring(0, 1).toUpperCase();
		String s2 = s1 + s.substring(1);
		//System.out.println(s2);
		return s2;
		
   }
	
}
