package test.java;

import main.java.Question5_RotateList;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Author: Titus Murithi Bundi
 * Date:7/29/25
 */
public class Question5_RotateListTest {
    @Test
    public void rotatesListByGivenSteps() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(Arrays.asList(4, 5, 1, 2, 3), Question5_RotateList.rotateRight(nums, 2));
    }

    @Test
    public void returnsSameListWhenRotatedByZeroSteps() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), Question5_RotateList.rotateRight(nums, 0));
    }

    @Test
    public void handlesRotationByListSize() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(Arrays.asList(1, 2, 3, 4, 5), Question5_RotateList.rotateRight(nums, 5));
    }

    @Test
    public void handlesRotationByMoreThanListSize() {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(Arrays.asList(4, 5, 1, 2, 3), Question5_RotateList.rotateRight(nums, 7));
    }

    @Test
    public void handlesEmptyList() {
        List<Integer> nums = Collections.emptyList();
        assertEquals(Collections.emptyList(), Question5_RotateList.rotateRight(nums, 3));
    }

    @Test
    public void handlesSingleElementList() {
        List<Integer> nums = Collections.singletonList(42);
        assertEquals(Collections.singletonList(42), Question5_RotateList.rotateRight(nums, 10));
    }
}
