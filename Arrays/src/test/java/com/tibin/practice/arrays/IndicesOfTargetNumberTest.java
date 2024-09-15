package com.tibin.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndicesOfTargetNumberTest {

    @Test
    public void testIndicesOfTargetNumberTest() {
        int[] nums = {1, 2, 3, 4, 5};
        String expectedIndices = "1, 4";
        int target = 7;

        IndicesOfTargetNumber indicesOfTargetNumber = new IndicesOfTargetNumber();
        assertEquals(expectedIndices, indicesOfTargetNumber.findTargetIndices(nums, target));
    }

    @Test
    public void testIndicesOfTargetNumberTest1() {
        int[] nums = {4, 5, 3, 2, 1};
        int target = 7;
        String expectedIndices = "0, 2";

        IndicesOfTargetNumber indicesOfTargetNumber = new IndicesOfTargetNumber();
        assertEquals(expectedIndices, indicesOfTargetNumber.findTargetIndices(nums, target));
    }

    @Test
    public void testIndicesOfTargetNumberTest2() {
        int[] nums = {11, 45, 12, 55, 47};
        int target = 66;
        String expectedIndices = "0, 3";

        IndicesOfTargetNumber indicesOfTargetNumber = new IndicesOfTargetNumber();
        assertEquals(expectedIndices, indicesOfTargetNumber.findTargetIndices(nums, target));
    }

}