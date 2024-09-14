package com.tibin.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveAllZerosToRightTest {

    @Test
    public void testMoveAllZerosToRight() {
        int[] nums = {1, 0, 2, 4, 0, 0, 8, 9, 0, 0};
        int[] expectedNums = {1, 2, 4, 8, 9, 0, 0, 0, 0, 0};
        MoveAllZerosToRight moveAllZerosToRight = new MoveAllZerosToRight();

        assertArrayEquals(expectedNums, moveAllZerosToRight.shift(nums));
    }

}