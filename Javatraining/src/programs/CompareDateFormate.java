package programs;

import java.util.Scanner;

public class CompareDateFormate {

	public static void main(String[] args) {
		
		String str = "19/2/2022";
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the date:" );
		int date = sc.nextInt();
		
		if(date > 31 || date < 1)
		{
			System.out.println("Invalid Date");
		}
		
		
		System.out.println("Enter the month:");
		int month = sc.nextInt();
		
		if(month > 12 || month < 1) {
			System.out.println("InValid Month");
		}
		
		
		
		System.out.println("Enter the Year;");
		int year = sc.nextInt();
		if(year > 2022 || year < 2000 ) {
			System.out.println("Year is not with in range");
			
		}
		if(date >13) {
		if(year >= 2022) {
			if(month >=10) {
				if(date >13) {
					System.out.println("Date is out of range");
				}
			}
		}
	}
		String str1 = date + "/" + month + "/" + year ;
		
	
		
		

	    System.out.println("The user Date:" +str1);
	    System.out.println("The Given Date:" +str);
	   
	    
	    if( str1.equals(str)) {
	    	System.out.println("Date  is Matched");
	    	
	    }
	    else {
	    		System.out.println("Date doesn't Match");
	    	}
	    	
	    }
	
	
	}





