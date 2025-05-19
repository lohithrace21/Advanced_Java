/* Write a Java Program for  Capitalizing the first letter of each word. using user defined function 
capitalizeWords()*/

package stringoperation;
import java.util.Scanner;
	public class CapitalizeEachWord {

	    // User-defined function to capitalize the first letter of each word
	    public static String capitalizeWords(String input) {
	        String[] words = input.trim().split("\\s+");  // Split by one or more spaces
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                // Capitalize first letter and append rest in lowercase
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                           .append(word.substring(1).toLowerCase())
	                           .append(" ");
	            }
	        }

	        return capitalized.toString().trim();  // Remove trailing space
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        // Capitalize words using the function
	        String result = capitalizeWords(userInput);

	        // Output the result
	        System.out.println("Capitalized string: " + result);

	        scanner.close();
	    }
	}

