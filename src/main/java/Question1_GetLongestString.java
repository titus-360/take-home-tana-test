package main.java;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Titus Murithi Bundi
 * Date:7/29/25
 */
public class Question1_GetLongestString {

    /**
     * This method returns the longest string from the input list that:
     * 1. Contains only characters from the given set of valid characters.
     * 2. Has no identical characters placed consecutively (like "AA").
     */
    public static String getLongestString(Set<Character> validChars, String[] strings) {
        String longest = "";  // Will store the longest valid string found

        for (String s : strings) {
            // Check if current string satisfies both conditions
            if (isValid(s, validChars)) {
                // If it's longer than what we've seen so far, update the result
                if (s.length() > longest.length()) {
                    longest = s;
                }
            }
        }

        return longest;
    }

    /**
     * Checks whether the input string:
     * - Only includes characters from the validChars set
     * - Does not have two same characters next to each other
     */
    private static boolean isValid(String s, Set<Character> validChars) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the character is not in the allowed set, the string is invalid
            if (!validChars.contains(c)) {
                return false;
            }

            // Check for consecutive identical characters
            if (i > 0 && c == s.charAt(i - 1)) {
                return false;
            }
        }

        // Passed both checks, so it's valid
        return true;
    }

    public static void main(String[] args) {
        // Define allowed characters
        Set<Character> validChars = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D'));

        // List of input strings to check
        String[] inputStrings = {
                "AABCDA",       // Invalid: has repeated 'A'
                "ABCDZADC",     // Invalid: contains 'Z'
                "ABCDBCA",      // Valid
                "ABCDABDCA"     // Valid and longest
        };

        // Run function and print result
        String result = getLongestString(validChars, inputStrings);
        System.out.println("Result: " + result);  // Expected: ABCDABDCA
    }
}
