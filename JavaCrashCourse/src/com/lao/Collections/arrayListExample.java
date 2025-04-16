package com.lao.Collections;

import java.util.ArrayList;
import java.util.*;

public class arrayListExample {
    public static void main(String[] args) {
        // Use List interface and name the list L1
        List<String> L1 = new ArrayList<>();

        // 1. add(E e) – Adds element to the end
        L1.add("Apple");
        L1.add("Banana");
        System.out.println("After add: " + L1); // [Apple, Banana]

        // 2. add(int index, E element) – Adds at specific index
        L1.add(1, "Mango");
        System.out.println("After add at index 1: " + L1); // [Apple, Mango, Banana]
        
        L1.add(1, "Arun");
        System.out.println(L1);

        // 3. contains(Object o) – Checks if element exists
        System.out.println("Contains Mango? " + L1.contains("Mango")); // true

        // 4. get(int index) – Gets the element at index
        System.out.println("Element at index 0: " + L1.get(0)); // Apple

        // 5. indexOf(Object o) – Finds index of element
        System.out.println("Index of Banana: " + L1.indexOf("Banana")); // 2

        // 6. remove(int index) – Removes element at index
        L1.remove(0); // Removes "Apple"
        System.out.println("After removing index 0: " + L1); // [Mango, Banana]

        // 7. remove(Object o) – Removes by value
        L1.remove("Mango");
        System.out.println("After removing 'Mango': " + L1); // [Banana]

        // 8. size() – Number of elements
        System.out.println("Size: " + L1.size()); // 1

        // 9. isEmpty() – Checks if list is empty
        System.out.println("Is list empty? " + L1.isEmpty()); // false

        // 10. clear() – Removes all elements
        L1.clear();
        System.out.println("After clear: " + L1); // []

        // 11. addAll(Collection c) – Adds all elements from another list
        List<String> L2 = Arrays.asList("Kiwi", "Pineapple", "Grapes");
        L1.addAll(L2);
        System.out.println("After addAll: " + L1); // [Kiwi, Pineapple, Grapes]

        // 12. toArray() – Converts to array
        Object[] array = L1.toArray();
        System.out.println("Converted to array: " + Arrays.toString(array)); // [Kiwi, Pineapple, Grapes]
    }
}
