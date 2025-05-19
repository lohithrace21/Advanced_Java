/* Write a Java program to insert the specified element at the end of a linked list.( using 
l_listobj.offerLast("Pink"))*/

package LinkedList;
import java.util.LinkedList;
	public class InsertAtEndExample {
	    public static void main(String[] args) {
	        // Create a LinkedList and add some initial elements
	        LinkedList<String> l_list = new LinkedList<>();
	        l_list.add("Red");
	        l_list.add("Green");
	        l_list.add("Blue");

	        // Insert "Pink" at the end using offerLast()
	        l_list.offerLast("Pink");

	        // Print the updated list
	        System.out.println("Linked list after inserting 'Pink' at the end:");
	        for (String color : l_list) {
	            System.out.println(color);
	        }
	    }
	}
