/*. Write a Java Program for  Shortening a string to a specified length and adds an ellipsis using user 
defined function truncate()*/

package stringoperation;
import java.util.Scanner;
	public class StringTruncator {

	    // User-defined function to truncate a string and add ellipsis
	    public static String truncate(String input, int maxLength) {
	        if (input == null || maxLength <= 0) {
	            return "...";
	        }
	        
	        // If input is already within the limit, return as is
	        if (input.length() <= maxLength) {
	            return input;
	        }

	        // If maxLength is less than 3, we can't add "..." properly
	        if (maxLength <= 3) {
	            return "...".substring(0, maxLength);
	        }

	        // Truncate and add ellipsis
	        return input.substring(0, maxLength - 3) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User input
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        System.out.print("Enter the maximum length: ");
	        int maxLength = scanner.nextInt();

	        // Use truncate function
	        String result = truncate(userInput, maxLength);

	        // Output result
	        System.out.println("Truncated string: " + result);

	        scanner.close();
	    }
	}

