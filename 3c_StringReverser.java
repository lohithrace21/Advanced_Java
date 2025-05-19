/*
Write a Java Program for  Reversing the characters in a string using user defined function 
reverseString().
*/
package stringoperation;
import java.util.Scanner;
	public class StringReverser {

	    // User-defined function to reverse a string
	    public static String reverseString(String input) {
	        String reversed = "";
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i);
	        }
	        return reversed;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input from the user
	        System.out.print("Enter a string: ");
	        String originalString = scanner.nextLine();

	        // Calling the user-defined function
	        String reversedString = reverseString(originalString);

	        // Output the result
	        System.out.println("Reversed string: " + reversedString);

	        scanner.close();
	    }
	}

