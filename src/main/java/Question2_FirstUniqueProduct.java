package main.java;

import java.util.*;

/**
 * Author: Titus Murithi Bundi
 * Date:7/29/25
 */
public class Question2_FirstUniqueProduct {

    public static void main(String[] args) {
        // Test cases to demonstrate the function
        System.out.println("Example 1: " + getFirstUniqueProduct(new String[]{"apple", "banana", "apple", "orange"})); // Output: banana
        System.out.println("Example 2: " + getFirstUniqueProduct(new String[]{"book", "pen", "book", "pen"}));         // Output: None
        System.out.println("Example 3: " + getFirstUniqueProduct(new String[]{"watch"}));                              // Output: watch
    }

    /**
     * Returns the first product in the array that occurs only once.
     * If there is no unique product, it returns "None".
     *
     * @param products an array of product names
     * @return the first product with a single occurrence, or "None"
     */
    public static String getFirstUniqueProduct(String[] products) {
        // LinkedHashMap keeps track of product order and how often each appears
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();

        // Count how many times each product appears
        for (String product : products) {
            frequencyMap.put(product, frequencyMap.getOrDefault(product, 0) + 1);
        }

        // Find the first product that appears only once
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        // If all products are repeated, return "None"
        return "None";
    }
}
