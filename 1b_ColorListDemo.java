/*Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList*/

package arraylist;
import java.util.ArrayList;
public class ColorListDemo {
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add some colors to the ArrayList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Display original list
	        System.out.println("Original colors list: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedElement = colors.remove(1);
	            System.out.println("Removed 2nd element: " + removedElement);
	        }

	        // Remove the color "Blue" (if it exists)
	        boolean removedBlue = colors.remove("Blue");
	        if (removedBlue) {
	            System.out.println("Removed color: Blue");
	        } else {
	            System.out.println("Color 'Blue' was not found in the list.");
	        }

	        // Display updated list
	        System.out.println("Updated colors list: " + colors);
	    }
	}
