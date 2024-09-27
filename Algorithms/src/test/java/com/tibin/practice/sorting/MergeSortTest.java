package com.tibin.practice.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {


    @Test
    public void testSort() {
        int[] nums = {5, 3, 7, 1, 0, 2};
        int[] expectedNums = {0, 1, 2, 3, 5, 7};
        Sort sort = new BubbleSort();

        assertArrayEquals(expectedNums, sort.sort(nums));
    }

    @Test
    public void testSortWithNegativeNumbers() {
        int[] nums = {4, 1, -6, -2, 7, 8};
        int[] sortedArray = {-6, -2, 1, 4, 7, 8};
        Sort sort = new BubbleSort();
        assertArrayEquals(sortedArray, sort.sort(nums));
    }

}