package programs;

public class Employee {
	private String firstname;
	private String lastname;
	private String password;
	private int passwordlength= 10;
	private String email;
	private int mailboxcapcity=10;
	private String alternateEmail="devi.sar@development.shopfy.com";
	
	
	

	public static void main(String[] args) {
		
		
		String firstname = "saranya";
		String lastname ="devi";
		String depart ="sales";
		//String com = "org";
		
		// calling the method that return email 
		
		Employee emilapp = new Employee();
		emilapp.email = emilapp.generateEmail(firstname,lastname,depart);
		emilapp.getEmployee();
		
		
		
		
	}
	public Employee(){ // constructor 
		
		this.password = this.generatePassword(passwordlength);
		//System.out.println("password:" +this.password);
		
		
		
		}
	
	// Generating an Email
	
	private   String  generateEmail(String firstname,String lastname,String depart) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		
		String email = "";
		
		
		if(depart=="") {
			email = firstname + "." + lastname + "@" + "shopfy" + ".com";
			
		}else if (isvalidateDepartment(depart)==true) {
			
			email = firstname + "." + lastname + "@" + depart + "." + "shopfy" + ".com" ;
			
		}else {
	
			System.out.println("Entered Department is not valid");
		}
		return email;
	}
	
	// Check for the Department
	
    private  boolean isvalidateDepartment(String department) {
    	
    	if(department=="sales" || department=="development" || department=="Accounting") {
    		return true;
    	}else {
    	
    		return false;
    	}
    	
    }
    //Generate Password
    
    private String generatePassword(int length) {
    	
    	String password ="ABCDEFGHIJKLMNOPQRSTUVWXYZ!#€%&/123456789";
    	
    	char[] pass = new char[length];
    	
    	for(int i=0;i<length;i++) {
    		int random = (int)(Math.random() * password.length()); // for generating random password any number * total length of password.
    		pass[i] = password.charAt(random);
    		
    	}
    	
    	
		return new String(pass);
    	
    	
    } 
    // setMethod
    public void setPassword(String pswd,int mailcapcity,String altermail) {
    	
    	this.password = pswd;
    	this.mailboxcapcity = mailcapcity;
    	this.alternateEmail=altermail;
    }
    //getMethod
    public void getEmployee() {
    	System.out.println("Name of Employee:" +this.firstname + " " + this.lastname);
    	System.out.println("Email:" +this.email);
    	System.out.println("Password: " +this.password);
    	System.out.println("The MailBox capacity: " +this.mailboxcapcity);
    	System.out.println("Alternate Email: " +this.alternateEmail);
    }
    
	
}
