/*. Write a Java Program for  Counting the number of words in a string using user defined function  
countWords()*/

package stringoperation;
import java.util.Scanner;
	public class WordCounter {

	    // User-defined function to count the number of words in a string
	    public static int countWords(String input) {
	        // Trim leading and trailing spaces
	        input = input.trim();

	        // If the string is empty after trimming, return 0
	        if (input.isEmpty()) {
	            return 0;
	        }

	        // Split the string by one or more whitespace characters
	        String[] words = input.split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User input
	        System.out.print("Enter a string: ");
	        String userInput = scanner.nextLine();

	        // Count words using the function
	        int wordCount = countWords(userInput);

	        // Output result
	        System.out.println("Number of words: " + wordCount);

	        scanner.close();
	    }
	}
