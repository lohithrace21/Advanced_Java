/* Write a Java Program for Checking if a given string is null or contains only whitespace using user 
defined function isNullOrEmpty()*/

package stringoperation;
import java.util.Scanner;
	public class NullOrEmptyCheck {

	    // User-defined function to check if the string is null or only whitespace
	    public static boolean isNullOrEmpty(String str) {
	        return (str == null || str.trim().isEmpty());
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string to check: ");
	        String input = scanner.nextLine();

	        if (isNullOrEmpty(input)) {
	            System.out.println("The string is either null or contains only whitespace.");
	        } else {
	            System.out.println("The string is not null and contains non-whitespace characters.");
	        }

	        scanner.close();
	    }
	}


