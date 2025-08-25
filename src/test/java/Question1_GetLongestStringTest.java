package test.java;

import main.java.Question1_GetLongestString;
import org.junit.Test;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;


/**
 * Author: Titus Murithi Bundi
 * Date:7/29/25
 */
public class Question1_GetLongestStringTest {

    @Test
    public void returnsLongestValidString() {
        Set<Character> validChars = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D'));
        String[] inputStrings = {"AABCDA", "ABCDBCA", "ABCDABDCA"};
        assertEquals("ABCDABDCA", Question1_GetLongestString.getLongestString(validChars, inputStrings));
    }

    @Test
    public void returnsEmptyStringWhenNoValidStrings() {
        Set<Character> validChars = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D'));
        String[] inputStrings = {"ZZZZ", "AA", "BB"};
        assertEquals("", Question1_GetLongestString.getLongestString(validChars, inputStrings));
    }

    @Test
    public void handlesEmptyInputArray() {
        Set<Character> validChars = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D'));
        String[] inputStrings = {};
        assertEquals("", Question1_GetLongestString.getLongestString(validChars, inputStrings));
    }

    @Test
    public void handlesEmptyValidCharsSet() {
        Set<Character> validChars = new HashSet<>();
        String[] inputStrings = {"ABCD", "A", "B"};
        assertEquals("", Question1_GetLongestString.getLongestString(validChars, inputStrings));
    }

    @Test
    public void handlesStringsWithOnlyValidCharactersButConsecutiveDuplicates() {
        Set<Character> validChars = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D'));
        String[] inputStrings = {"AABBCC", "ABABAB", "CCDDAA"};
        assertEquals("ABABAB", Question1_GetLongestString.getLongestString(validChars, inputStrings));
    }

    @Test
    public void handlesStringsWithMixedValidAndInvalidCharacters() {
        Set<Character> validChars = new HashSet<>(Arrays.asList('A', 'B', 'C', 'D'));
        String[] inputStrings = {"ABCDZ", "ABCD", "ZZZZ"};
        assertEquals("ABCD", Question1_GetLongestString.getLongestString(validChars, inputStrings));
    }
}