package programs;

import java.util.Scanner;

public class CountOccurance {

	public static void main(String[] args) {
		
		
		
		int[] a = {10,70,10,20,40,50,20,20};
		
		int x= 20;
		
		int res = countOccurance(a,x);
		System.out.println(res);
		
		
	}
	public static int countOccurance(int[] a, int x) {
		
		int count = 0;
		for(int i = 0;i< a.length; i++) {
			if(a[i]==x) {
				count++;
			}
		}
		return count;
		
	}

}
