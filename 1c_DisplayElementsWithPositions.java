/* Write a Java program to display elements and their positions in a linked list ( using 
l_listobj.get(p) */
package LinkedList;
import java.util.LinkedList;
	public class DisplayElementsWithPositions {
	    public static void main(String[] args) {
	        // Create and initialize the LinkedList
	        LinkedList<String> l_list = new LinkedList<>();
	        l_list.add("Alpha");
	        l_list.add("Beta");
	        l_list.add("Gamma");
	        l_list.add("Delta");
	        l_list.add("Epsilon");

	        // Display elements with their positions
	        System.out.println("Elements and their positions in the LinkedList:");
	        for (int i = 0; i < l_list.size(); i++) {
	            System.out.println("Position " + i + ": " + l_list.get(i));
	        }
	    }
	}
