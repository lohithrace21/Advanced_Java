/*Write a Java Program for  Verifying if a string contains only numeric characters using user defined 
function  isNumeric()
*/


package stringoperation;
import java.util.Scanner;
public class NumericChecker {

	    // User-defined function to check if a string contains only numeric characters
	    public static boolean isNumeric(String input) {
	        // Return false if input is null or empty
	        if (input == null || input.isEmpty()) {
	            return false;
	        }

	        // Check each character to see if it's a digit
	        for (int i = 0; i < input.length(); i++) {
	            if (!Character.isDigit(input.charAt(i))) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User input
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        // Check if input is numeric
	        if (isNumeric(userInput)) {
	            System.out.println("The string contains only numeric characters.");
	        } else {
	            System.out.println("The string does NOT contain only numeric characters.");
	        }

	        scanner.close();
	    }
	}

