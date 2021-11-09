package leet_code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromASortedArrayTest {
    private int[] array;
    @BeforeEach
    void initialization(){
        array = new int[]{2,5,5,5,9,23,28};
    }

    @Test
    void returnsTheCorrectLength(){
        //when
        int k = RemoveDuplicatesFromASortedArray.solution(array);
        System.out.println(Arrays.toString(array));
        //assert
        assertEquals(5, k);
    }

    @Test
    void returnsSimilarArray(){
        //when
        int k = RemoveDuplicatesFromASortedArray.solution(array);
        System.out.println(Arrays.toString(array));
        int[] expectedArray = new int[]{2,5,9,23,28};
        for (int i = 0; i < k; i++) {
            System.out.println(i);
            assertEquals(expectedArray[i], array[i]);
        }
    }
}