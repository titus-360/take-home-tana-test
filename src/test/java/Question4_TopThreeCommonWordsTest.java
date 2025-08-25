package test.java;

import main.java.Question4_TopThreeCommonWords;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

/**
 * Author: Titus Murithi Bundi
 * Date:7/29/25
 */
public class Question4_TopThreeCommonWordsTest {

    @Test
    public void returnsTopThreeWordsIgnoringCaseAndPunctuation() {
        String sentence = "The quick brown fox jumps over the lazy dog. The dog was not amused.";
        assertEquals(Arrays.asList("the", "dog", "amused"), Question4_TopThreeCommonWords.getTopThreeWords(sentence));
    }

    @Test
    public void returnsTopThreeWordsForSentenceWithRepeatedWords() {
        String sentence = "Hello, hello! HELLO?? How low can you go? Go, go, go!";
        assertEquals(Arrays.asList("go", "hello", "how"), Question4_TopThreeCommonWords.getTopThreeWords(sentence));
    }

    @Test
    public void returnsAllWordsWhenLessThanThreeUniqueWordsExist() {
        String sentence = "apple banana apple";
        assertEquals(Arrays.asList("apple", "banana"), Question4_TopThreeCommonWords.getTopThreeWords(sentence));
    }

    @Test
    public void returnsEmptyListForEmptyString() {
        String sentence = "";
        assertEquals(Collections.emptyList(), Question4_TopThreeCommonWords.getTopThreeWords(sentence));
    }

    @Test
    public void handlesStringWithOnlyPunctuation() {
        String sentence = "!!!...,,,";
        assertEquals(Collections.emptyList(), Question4_TopThreeCommonWords.getTopThreeWords(sentence));
    }

    @Test
    public void handlesStringWithSingleWordRepeated() {
        String sentence = "test test test test";
        assertEquals(Collections.singletonList("test"), Question4_TopThreeCommonWords.getTopThreeWords(sentence));
    }

    @Test
    public void handlesStringWithMultipleWordsHavingSameFrequency() {
        String sentence = "cat dog bird cat dog bird";
        assertEquals(Arrays.asList("cat", "dog", "bird"), Question4_TopThreeCommonWords.getTopThreeWords(sentence));
    }

}
