package test;

import leet_code.SumOfTwoNumbers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SumOfTwoNumbersTest {
    @Test
    void testExtractFromList(){
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(5, 6, 4));
        int number = SumOfTwoNumbers.extractDataFromList(linkedList);
        assertEquals(465, number);
    }

    @Test
    void testAddTwoNumbers(){
        LinkedList<Integer> linkedList = new LinkedList<>(List.of(5, 6, 4));
        LinkedList<Integer> linkedListTwo = new LinkedList<>(List.of(2, 4, 3));
        LinkedList<Integer> expected = new LinkedList<>(List.of(7,0,8));
        LinkedList<Integer> actual = SumOfTwoNumbers.addTwoNumbers(linkedList, linkedListTwo);
        assertTrue(expected.size()==actual.size()&&expected.containsAll(actual)&&actual.containsAll(expected));
    }
}