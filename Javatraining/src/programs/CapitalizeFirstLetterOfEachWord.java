package programs;

public class CapitalizeFirstLetterOfEachWord {

	public static void main(String[] args) {

		// Capitalize First Letter Of Each Word

		System.out.println("\n********Capitalize First Letter Of Each Word*********\n");

			String str = "this is java code";
			System.out.println("Original String: " + str);
			
			String[] words = str.split("\s");
		
			String capitalizeStr = "";

			for (String word : words) {
				// Capitalize first letter
				String firstLetter = word.substring(0, 1);
				// Get remaining letter
				String remainingLetters = word.substring(1);
				//capitalizeStr += firstLetter.toUpperCase() + remainingLetters + " ";
				capitalizeStr = capitalizeStr + firstLetter.toUpperCase() + remainingLetters + " ";
				
			}
			System.out.println(capitalizeStr);
			



	}

}
