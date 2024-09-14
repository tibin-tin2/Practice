package com.tibin.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfAllElementsExceptCurrentTest {

    @Test
    public void testMaxSum1() {
        int[] nums = {1, 2, 3, 4};
        int[] expectedNums = {24, 12, 8, 6};
        ProductOfAllElementsExceptCurrent productOfAllElementsExceptCurrent = new ProductOfAllElementsExceptCurrent();
        assertArrayEquals(expectedNums, productOfAllElementsExceptCurrent.productArr(nums));
    }

    @Test
    public void testMaxSumWithNegativeNumbers (){
        int[] nums = {1, -2, 3, -4};
        int[] expectedNums = {24, -12, 8, -6};
        ProductOfAllElementsExceptCurrent productOfAllElementsExceptCurrent = new ProductOfAllElementsExceptCurrent();
        assertArrayEquals(expectedNums, productOfAllElementsExceptCurrent.productArr(nums));
    }

}