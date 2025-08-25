package test.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Author: Titus Murithi Bundi
 * Date:7/29/25
 */
public class Question2_FirstUniqueProductTest {

    @Test
    public void returnsFirstUniqueProductWhenPresent() {
        String[] products = {"apple", "banana", "apple", "orange"};
        assertEquals("banana", main.java.Question2_FirstUniqueProduct.getFirstUniqueProduct(products));
    }


    @Test
    public void returnsNoneWhenNoUniqueProductExists() {
        String[] products = {"book", "pen", "book", "pen"};
        assertEquals("None", main.java.Question2_FirstUniqueProduct.getFirstUniqueProduct(products));
    }

    @Test
    public void returnsProductWhenOnlyOneProductExists() {
        String[] products = {"watch"};
        assertEquals("watch", main.java.Question2_FirstUniqueProduct.getFirstUniqueProduct(products));
    }

    @Test
    public void handlesEmptyArray() {
        String[] products = {};
        assertEquals("None", main.java.Question2_FirstUniqueProduct.getFirstUniqueProduct(products));
    }

    @Test
    public void handlesArrayWithAllUniqueProducts() {
        String[] products = {"car", "bike", "plane"};
        assertEquals("car", main.java.Question2_FirstUniqueProduct.getFirstUniqueProduct(products));
    }

    @Test
    public void handlesArrayWithMultipleOccurrencesOfSameProduct() {
        String[] products = {"pen", "pen", "pen"};
        assertEquals("None", main.java.Question2_FirstUniqueProduct.getFirstUniqueProduct(products));
    }
}
