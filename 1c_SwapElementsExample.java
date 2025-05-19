/* Write a Java program that swaps two elements ( first and third elements ) in a linked list  ( using
 Collections.swap(l_list, 0, 2))*/
package LinkedList;
import java.util.LinkedList;
import java.util.Collections;
	public class SwapElementsExample {
	    public static void main(String[] args) {
	        // Create and initialize the LinkedList
	        LinkedList<String> l_list = new LinkedList<>();
	        l_list.add("One");
	        l_list.add("Two");
	        l_list.add("Three");
	        l_list.add("Four");

	        // Display the original list
	        System.out.println("Original LinkedList:");
	        System.out.println(l_list);

	        // Swap the first (index 0) and third (index 2) elements
	        Collections.swap(l_list, 0, 2);

	        // Display the modified list
	        System.out.println("LinkedList after swapping first and third elements:");
	        System.out.println(l_list);
	    }
	}

