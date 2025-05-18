/*Write a java program for getting different colors through ArrayList interface and extract the
elements 1st and 2nd from the ArrayList object by using SubList()*/
package arraylist;
import java.util.ArrayList;
import java.util.List;
public class ColorSubListExample {
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

	        // Extract the 1st and 2nd elements using subList (index 0 to 2)
	        if (colors.size() >= 2) {
	            List<String> subColors = colors.subList(0, 2);
	            System.out.println("Extracted 1st and 2nd elements: " + subColors);
	        } else {
	            System.out.println("Not enough elements to extract a sublist.");
	        }
	    }
	}
