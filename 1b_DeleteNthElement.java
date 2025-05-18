/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/
package arraylist;
import java.util.ArrayList;
import java.util.Scanner;
public class DeleteNthElement {
	    public static void main(String[] args) {
	        // Create an ArrayList and add color names
	        ArrayList<String> colors = new ArrayList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original Colors List: " + colors);

	        // Get user input for the n-th element to remove
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the index (n) of the element to delete (starting from 0): ");
	        int n = scanner.nextInt();

	        // Remove the element at index n, if valid
	        if (n >= 0 && n < colors.size()) {
	            String removedColor = colors.remove(n);
	            System.out.println("Removed color at index " + n + ": " + removedColor);
	        } else {
	            System.out.println("Invalid index. No element removed.");
	        }

	        // Display the updated list
	        System.out.println("Updated Colors List: " + colors);
	    }
	}
