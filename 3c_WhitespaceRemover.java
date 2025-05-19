/*Write a Java Program for Eliminating all whitespace characters from a string using user defined 
function removeWhitespace()*/

package stringoperation;
import java.util.Scanner;
	public class WhitespaceRemover {

	    // User-defined function to remove all whitespace characters from a string
	    public static String removeWhitespace(String input) {
	        // Replace all whitespace characters (space, tab, newline, etc.) with empty string
	        return input.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from user
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        // Remove whitespaces using the function
	        String result = removeWhitespace(userInput);

	        // Display the result
	        System.out.println("String without whitespace: " + result);

	        scanner.close();
	    }
	}

