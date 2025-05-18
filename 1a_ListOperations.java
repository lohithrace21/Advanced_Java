/*
Develop a Java program for adding elements   [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the  following operations with different functions directed  as
follows
1. Adding elements,   2. Adding element at specific index, 3. Adding multiple elements, 4. 
Accessing elements,5. Updating elements, 6. Removing elements,  7. Searching elements,  8. List 
size, 9. Iterating over list, 10. Using Iterator,  11. Sorting, 12. Sublist, 13. Clearing the list
*/

package operations;
import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("== ARRAYLIST OPERATIONS ==");
        performAllOperations(arrayList);

        System.out.println("\n== LINKEDLIST OPERATIONS ==");
        performAllOperations(linkedList);
    }

    public static void performAllOperations(List<String> list) {
        // 1. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("After adding elements: " + list);

        // 2. Adding element at specific index
        list.add(1, "Grapes");
        System.out.println("After adding 'Grapes' at index 1: " + list);

        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Mango", "Pineapple");
        list.addAll(moreFruits);
        System.out.println("After adding multiple elements: " + list);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + list.get(2));

        // 5. Updating elements
        list.set(2, "Kiwi");
        System.out.println("After updating index 2 to 'Kiwi': " + list);

        // 6. Removing elements
        list.remove("Banana");
        list.remove(0);  // removes first element
        System.out.println("After removing elements: " + list);

        // 7. Searching elements
        System.out.println("Contains 'Mango'? " + list.contains("Mango"));

        // 8. List size
        System.out.println("List size: " + list.size());

        // 9. Iterating over list (for-each loop)
        System.out.print("Iterating (for-each): ");
        for (String fruit : list) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 10. Using Iterator
        System.out.print("Iterating (iterator): ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Sorting
        Collections.sort(list);
        System.out.println("After sorting: " + list);

        // 12. Sublist
        if (list.size() >= 2) {
            List<String> sublist = list.subList(0, 2);
            System.out.println("Sublist (0 to 2): " + sublist);
        }

        // 13. Clearing the list
        list.clear();
        System.out.println("After clearing the list: " + list);
    }
}
