package test.java;

import main.java.Question3_MinimumDistance;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Titus Murithi Bundi
 * Date:7/29/25
 */
public class Question3_MinimumDistanceTest {

    @Test
    public void returnsCorrectMinimumDistanceForRepeatedValues() {
        int[] arr = {3, 2, 1, 2, 3};
        assertEquals(2, Question3_MinimumDistance.findMinimumDistance(arr));
    }

    @Test
    public void returnsNegativeOneWhenAllValuesAreUnique() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, Question3_MinimumDistance.findMinimumDistance(arr));
    }

    @Test
    public void returnsCorrectMinimumDistanceForCloseRepeatedValues() {
        int[] arr = {7, 1, 3, 1, 2, 7};
        assertEquals(2, Question3_MinimumDistance.findMinimumDistance(arr));
    }

    @Test
    public void returnsNegativeOneForEmptyArray() {
        int[] arr = {};
        assertEquals(-1, Question3_MinimumDistance.findMinimumDistance(arr));
    }

    @Test
    public void returnsNegativeOneForSingleElementArray() {
        int[] arr = {42};
        assertEquals(-1, Question3_MinimumDistance.findMinimumDistance(arr));
    }

    @Test
    public void returnsCorrectMinimumDistanceForArrayWithAllSameValues() {
        int[] arr = {5, 5, 5, 5, 5};
        assertEquals(1, Question3_MinimumDistance.findMinimumDistance(arr));
    }

    @Test
    public void returnsCorrectMinimumDistanceForLargeArrayWithDuplicates() {
        int[] arr = {1, 2, 3, 4, 5, 1, 6, 7, 8, 9, 2};
        assertEquals(5, Question3_MinimumDistance.findMinimumDistance(arr));
    }

}
