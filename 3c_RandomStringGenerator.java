/*Write a Java Program for  Creating  a random string of a specified length using user defined 
function generateRandomString()*/

package stringoperation;
import java.util.Random;
import java.util.Scanner;
	public class RandomStringGenerator {

	    // User-defined function to generate a random string of given length
	    public static String generateRandomString(int length) {
	        // Define the characters to include in the random string
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random random = new Random();
	        StringBuilder result = new StringBuilder();

	        // Generate random characters from the set
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            result.append(characters.charAt(index));
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User input for string length
	        System.out.print("Enter the desired length of the random string: ");
	        int length = scanner.nextInt();

	        // Validate length
	        if (length <= 0) {
	            System.out.println("Length must be a positive number.");
	        } else {
	            // Generate and display random string
	            String randomString = generateRandomString(length);
	            System.out.println("Random String: " + randomString);
	        }

	        scanner.close();
	    }
	}
