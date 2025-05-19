/*Write a Java Program for Checking if a string reads the same backward as forward (ignoring case 
and punctuation) using user defined function isPalindrome():*/
package stringoperation;
import java.util.Scanner;
	public class PalindromeChecker {

	    // User-defined function to check if a string is a palindrome
	    public static boolean isPalindrome(String input) {
	        // Remove all non-letter and non-digit characters, and convert to lowercase
	        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Reverse the cleaned string
	        String reversed = "";
	        for (int i = cleaned.length() - 1; i >= 0; i--) {
	            reversed += cleaned.charAt(i);
	        }

	        // Check if cleaned string is equal to its reverse
	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string from the user
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        // Check for palindrome
	        if (isPalindrome(userInput)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        scanner.close();
	    }
	}

