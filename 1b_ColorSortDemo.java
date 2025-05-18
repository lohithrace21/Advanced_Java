/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/

package arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ColorSortDemo {
	    public static void main(String[] args) {
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Add color names to the list
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original colors list: " + colors);

	        // Sort the colors in alphabetical order
	        Collections.sort(colors);

	        // Display the sorted list
	        System.out.println("Sorted colors list: " + colors);
	    }
	}
