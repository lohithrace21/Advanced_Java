/*Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
package arraylist;
import java.util.ArrayList;
	public class ColorSearch {
	    public static void main(String[] args) {
	        // Create an ArrayList to store colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the ArrayList
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Red");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Display all colors
	        System.out.println("Available Colors: " + colors);

	        // Search for the color "Red"
	        String searchColor = "Red";
	        if (colors.contains(searchColor)) {
	            System.out.println("The color \"" + searchColor + "\" is available in the list.");
	        } else {
	            System.out.println("The color \"" + searchColor + "\" is NOT available in the list.");
	        }
	    }
	}
