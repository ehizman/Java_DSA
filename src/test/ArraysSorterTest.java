package test;

import arrays.exceptions.ArraysSorterException;
import arrays.services.ArraysSorter;
import arrays.services.BubbleSorter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysSorterTest {
    private ArraysSorter sorter;

    @BeforeEach
    void setUp() {
        sorter = new BubbleSorter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sortAscendingWithoutAnArray() {
        assertThrows(ArraysSorterException.class, () -> sorter.sortAscending(null));
    }

    @Test
    void sortArrayAscending() {
        int[] scores = {10,5, 3, 7, 9, 2, 1, 6, 4, 8};
        try{
            int[] sortedScores = sorter.sortAscending(scores);
            int[] expectedArray = {1,2,3,4,5,6,7,8,9,10};
            assertArrayEquals(expectedArray, sortedScores);
        }
        catch (ArraysSorterException ex){
            ex.printStackTrace();
        }
    }

    @Test
    void sortDescendingWithoutAnArray() {
        assertThrows(ArraysSorterException.class, () -> sorter.sortAscending(null));
    }

    @Test
    void sortArrayDescending() {
        int[] scores = {10,5, 3, 7, 9, 2, 1, 6, 4, 8};
        try{
            int[] sortedScores = sorter.sortDescending(scores);
            int[] expectedArray = {10,9,8,7,6,5,4,3,2,1};
            assertArrayEquals(expectedArray, sortedScores);
        }
        catch (ArraysSorterException ex){
            ex.printStackTrace();
        }
    }
}