package main.java;

import java.util.*;

/**
 * Author: Titus Murithi Bundi
 * Date:7/29/25
 */
public class Question4_TopThreeCommonWords {

    /**
     * This program finds the top three most common words in a given sentence.
     * It ignores punctuation and is case-insensitive.
     */
    public static void main(String[] args) {
        String input1 = "the quick brown fox jumps over the lazy dog. the dog was not amused.";
        String input2 = "Hello, hello! HELLO?? How low can you go? Go, go, go!";

        System.out.println("Example 1: " + getTopThreeWords(input1));
        System.out.println("Example 2: " + getTopThreeWords(input2));
    }

    /**
     * Finds the top 3 most common words in the sentence.
     * - Words are case-insensitive.
     * - Punctuation is ignored.
     *
     * @param sentence the input sentence
     * @return a list of the top three most frequent words
     */
    public static List<String> getTopThreeWords(String sentence) {
        // Normalize sentence: lowercase and remove punctuation using regex
        String cleaned = sentence.toLowerCase().replaceAll("[^a-z\\s]", "");

        // Split the cleaned string into words
        String[] words = cleaned.split("\\s+");

        // Count frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Create a max-heap (priority queue) sorted by word frequency
        PriorityQueue<Map.Entry<String, Integer>> maxHeap = new PriorityQueue<>(
                (a, b) -> b.getValue() - a.getValue()
        );
        maxHeap.addAll(wordCount.entrySet());

        // Extract the top three words
        List<String> result = new ArrayList<>();
        int count = 0;
        while (!maxHeap.isEmpty() && count < 3) {
            result.add(maxHeap.poll().getKey());
            count++;
        }

        return result;
    }
}
