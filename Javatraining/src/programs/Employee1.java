package programs;

import java.util.Scanner;

class Employee1 {
    private String firstName;
    private String lastName;  // class definition
    private int empId;
    private float salary;
    private String department;
   
    public Employee1() {
    }
   
    private String getName() {
    	
        return this.firstName + " " + this.lastName; 
    }
    
    public static void main(String []args) {
    	Employee1 empSaran = new Employee1(); // it will create a memory in java 
    	empSaran.firstName = "Saranya";
    	empSaran.lastName = "DEvi";
    	
    	String name = empSaran.getName();
    	
    	System.out.println(name);
    	Employee1 empprem =new Employee1();
    	empprem.firstName = "prem";
    	empprem.lastName ="anand";
    	String name2 = empprem.getName();
    	System.out.println(name2);
    	
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the firstName:");
    	String firstname = sc.next();
    	System.out.println("Enter the LastName:");
    	String lastname = sc.next();
    	Employee1 emp3 = new Employee1();
    	
    	String name3= firstname + lastname;
    	System.out.println(name3);
    	
    	
    	
    }
}


