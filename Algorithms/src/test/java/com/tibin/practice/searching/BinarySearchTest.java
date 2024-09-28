package com.tibin.practice.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int targetIndex = 5;

        Search search = new BinarySearch();

        assertEquals(targetIndex, search.search(arr, target));
    }

    @Test
    public void testBinarySearchInvalidTarget() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 10;
        int targetIndex = -1;

        Search search = new BinarySearch();

        assertEquals(targetIndex, search.search(arr, target));
    }

}