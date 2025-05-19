/*Write a Java program to iterate a linked list in reverse order (using 
objlist.descendingIterator())*/

package LinkedList;
import java.util.LinkedList;
import java.util.Iterator;
	public class ReverseLinkedListIteration {
	    public static void main(String[] args) {
	        // Create a LinkedList and add elements
	        LinkedList<String> list = new LinkedList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");
	        list.add("Elderberry");

	        // Get a descending iterator
	        Iterator<String> reverseIterator = list.descendingIterator();

	        // Iterate and print elements in reverse order
	        System.out.println("Iterating the linked list in reverse order:");
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}

