package com.tibin.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinLengthSumTest {

    @Test
    public void test() {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int expectedResult = 2;

        MinLengthSum minLengthSum = new MinLengthSum();

        assertEquals(expectedResult, minLengthSum.findMinLengthSum(arr, target));
    }

    @Test
    public void test1() {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 70;
        int expectedResult = 0;

        MinLengthSum minLengthSum = new MinLengthSum();

        assertEquals(expectedResult, minLengthSum.findMinLengthSum(arr, target));
    }

}