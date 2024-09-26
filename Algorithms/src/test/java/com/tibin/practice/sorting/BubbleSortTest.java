package com.tibin.practice.sorting;

import com.tibin.practice.util.ArrayPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    public void testSort() {
        int[] nums = {5, 3, 7, 1, 0, 2};
        int[] expectedNums = {0, 1, 2, 3, 5, 7};

        Sort sort = new BubbleSort();
        assertArrayEquals(expectedNums, sort.sort(nums) );
    }
}