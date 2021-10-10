package test;

import leet_code.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void testTwoSum(){
        //given
        int[] array = {2, 7, 11, 13};
        int target = 13;
        //when
        int[] actual = TwoSum.solution(array, target);
        int[] expected = {0,2};
        //assert
        assertArrayEquals(expected, actual);
    }

}