package programs;

public class CheckDuplicate {

	public static void main(String[] args) {
		
		int[] a =  {100,200,300,100};
		boolean res = checkDuplicate(a);
		System.out.println("Check the Duplicate present or not:" +res);

	}
	
	public static boolean checkDuplicate(int[] a) {
		
		
		
		for (int i= 0;i<=a.length-1;i++) {
			for(int j=i+1;j<=a.length-1;j++) {
			if(a[i] == a[j]) {
				return true;
			}
		}
		}
		return false;
	

	}
}
