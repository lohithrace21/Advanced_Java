/*Write a Java Program for Counting how many times a substring appears in a main string
 using user defined function countOccurrences()*/
package stringoperation;
import java.util.Scanner;
	public class SubstringCounter {

	    // User-defined function to count occurrences of a substring in a main string
	    public static int countOccurrences(String mainString, String subString) {
	        if (mainString == null || subString == null || subString.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        while ((index = mainString.indexOf(subString, index)) != -1) {
	            count++;
	            index += subString.length(); // Move index forward to avoid infinite loop
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the main string: ");
	        String mainString = scanner.nextLine();

	        System.out.print("Enter the substring to search for: ");
	        String subString = scanner.nextLine();

	        int occurrences = countOccurrences(mainString, subString);
	        System.out.println("The substring '" + subString + "' appears " + occurrences + " time(s) in the main string.");

	        scanner.close();
	    }
	}




