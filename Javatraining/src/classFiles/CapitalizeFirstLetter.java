package trainingOfLogics;

public class CapitalizeFirstLetter {
	public static void main(String[] args) {

		{// create a string
			String name = "hassain";
			System.out.println("Original String: " + name);
			// get First letter of the string
			String firstLetStr = name.substring(0, 1); // h
			// Get remaining letter using substring
			String remLetStr = name.substring(1); // assain

			// Convert the first letter of String to uppercase
			firstLetStr = firstLetStr.toUpperCase(); // H

			// Concatenate the first letter and remaining string
			String firstLetterCapitalizedName = firstLetStr + remLetStr; // Hassain
			System.out.println("String with first letter as Capital: " + firstLetterCapitalizedName);
		}

		}

}
