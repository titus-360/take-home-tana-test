package main.java;

import java.util.*;

/**
 * Author: Titus Murithi Bundi
 * Date:7/29/25
 */
public class Question5_RotateList {

    /**
     * Rotates the given list to the right by k steps.
     *
     * @param nums List of integers to rotate
     * @param k    Number of positions to rotate
     * @return Rotated list
     */
    public static List<Integer> rotateRight(List<Integer> nums, int k) {
        int n = nums.size();
        if (n == 0 || k % n == 0) return nums;

        // Normalize k in case it's larger than list size
        k = k % n;

        // Reverse full list
        Collections.reverse(nums);
        // Reverse first k elements
        Collections.reverse(nums.subList(0, k));
        // Reverse remaining n-k elements
        Collections.reverse(nums.subList(k, n));

        return nums;
    }

    public static void main(String[] args) {
        List<Integer> example1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> rotated1 = rotateRight(example1, 2);
        System.out.println("Example 1: " + rotated1); // Output: [4, 5, 1, 2, 3]

        List<Integer> example2 = new ArrayList<>(Arrays.asList(10, 20, 30));
        List<Integer> rotated2 = rotateRight(example2, 4);
        System.out.println("Example 2: " + rotated2); // Output: [30, 10, 20]
    }
}
