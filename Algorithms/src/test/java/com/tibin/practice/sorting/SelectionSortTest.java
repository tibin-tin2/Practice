package com.tibin.practice.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    @Test
    public void testSort() {
        int[] nums = {4, 1, 6, 2, 7, 8};
        int[] sortedArray = {1, 2, 4, 6, 7, 8};
        Sort sort = new SelectionSort();
        assertArrayEquals(sortedArray, sort.sort(nums));
    }

    @Test
    public void testSortWithNegativeNumbers() {
        int[] nums = {4, 1, -6, -2, 7, 8};
        int[] sortedArray = {-6, -2, 1, 4, 7, 8};
        Sort sort = new SelectionSort();
        assertArrayEquals(sortedArray, sort.sort(nums));
    }

}