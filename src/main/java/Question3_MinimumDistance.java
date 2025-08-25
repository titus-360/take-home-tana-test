package main.java;

import java.util.*;
/**
 * Author: Titus Murithi Bundi
 * Date:7/29/25
 */
public class Question3_MinimumDistance {

    public static void main(String[] args) {
        // Test case 1: repeated values
        System.out.println("Example 1: " + findMinimumDistance(new int[]{3, 2, 1, 2, 3})); // Output: 2

        // Test case 2: all values are unique
        System.out.println("Example 2: " + findMinimumDistance(new int[]{1, 2, 3, 4, 5})); // Output: -1

        // Test case 3: same value appears close together
        System.out.println("Example 3: " + findMinimumDistance(new int[]{7, 1, 3, 1, 2, 7})); // Output: 4
    }

    /**
     * Finds the minimum distance between any two equal elements in the array.
     * If no such elements exist, it returns -1.
     *
     * @param arr the input array of integers
     * @return the minimum distance between matching elements, or -1 if none found
     */
    public static int findMinimumDistance(int[] arr) {
        // Store the last seen index of each element
        Map<Integer, Integer> lastSeen = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];

            // If we've seen this value before, calculate the distance
            if (lastSeen.containsKey(value)) {
                int prevIndex = lastSeen.get(value);
                int distance = i - prevIndex;
                minDistance = Math.min(minDistance, distance);
            }

            // Update the last seen index for the current value
            lastSeen.put(value, i);
        }

        // If no duplicates were found, return -1
        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
    }
}
