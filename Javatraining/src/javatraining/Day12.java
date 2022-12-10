package javatraining;

public class Day12 {

	/*
	 * Date : 09/23/2022 Author : Hassain Basha Topic : What is Constructor? and
	 * Method calling, Constructor Chaining, Constructor Overloading and Method
	 * Overloading
	 */

	public static void main(String[] args) {
		Day12 d = new Day12();
		
		d.launchURL("https://www.flipkart.com/\t");
		d.launchURL("https://www.flipkart.com/\t");
		d.launchURL("https://www.flipkart.com/\t");
		login("9790488338", "123456");
		String product = productSearch("OnePlusTV");
		addToCart(product);
		addAddress(20, "Ruby", "AnnaNagar Main Road", "Pallikaranai", "Madurai", 600042);
		buy();
		makePayment();
		orderTracking();
		
		/*
		 * launchURL(); login(); productSearch(); addToCart(); addAddress(); buy();
		 * makePayment(); orderTracking();
		 */	
	}
	
	
	public void launchURL(String URL) {
		System.out.println(URL + "launched successfully");
	}

	public static void login(String username, String password) {
		System.out.println("Application loggedIn successfully with username: " + username + " & password:" + password);
	}

	public static String productSearch(String itemSearch) {
		System.out.println(itemSearch + " search is successfull");
		return itemSearch + "55 inch" ;
	}

	public static void addToCart(String product) {
		
		System.out.println(product + "Product added to Cart successfully");
	}

	public static void addAddress(int doorNo, String buindingName, String streetName, String area, String City, int pincode) {
		System.out.println("DoorNo" + doorNo + "\n"
							+ "buindingName" + buindingName + "\n"
							+ "streetName" + streetName + "\n"
							+ "city" + City + "\n"
							+ "pincode" + pincode + "\n");
		System.out.println("Address added successfully");
	}

	public static void buy() {
		System.out.println("User was able to click the Buy button without any issue");
	}
	
	public static void makePayment() {
		System.out.println("Transaction is successful");
	}
	
	public static void orderTracking() {
		System.out.println("Product live status can be tracked without any issue");
	}


	/*
	 * public static void launchURL() {
	 * System.out.println("Application launched successfully"); }
	 * 
	 * public static void login() {
	 * System.out.println("Application loggedIn successfully"); }
	 * 
	 * public static void productSearch() {
	 * System.out.println("User Search Successfull"); }
	 * 
	 * public static void addToCart() {
	 * System.out.println("Product added to Cart successfully"); }
	 * 
	 * public static void addAddress() {
	 * System.out.println("Address added successfully"); }
	 * 
	 * public static void buy() {
	 * System.out.println("User was able to click the Buy button without any issue"
	 * ); }
	 * 
	 * public static void makePayment() {
	 * System.out.println("Transaction is successful"); }
	 * 
	 * public static void orderTracking() {
	 * System.out.println("Product live status can be tracked without any issue"); }
	 */
}
