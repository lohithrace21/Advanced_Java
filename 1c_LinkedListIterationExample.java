/*Write a Java program to iterate through all elements in a linked list starting at the 
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/

package LinkedList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterationExample {
    public static void main(String[] args) {
        // Create a LinkedList and add some elements
        LinkedList<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        // Get an iterator starting from the 2nd position (index 1)
        ListIterator<String> iterator = list.listIterator(1);

        System.out.println("Iterating from the 2nd position:");
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
