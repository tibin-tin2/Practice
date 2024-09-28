package com.tibin.practice.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    @Test
    public void testSearch() {
        int[] arr = {1, 5, 2, 7, 9, 0};
        int target = 9;
        int targetIndex = 4;

        Search search = new LinearSearch();

        assertEquals(targetIndex, search.search(arr, target));
    }

    @Test
    public void testSearchNegative() {
        int[] arr = {1, 5, 2, 7, 9, 0};
        int target = 18;
        int targetIndex = -1;

        Search search = new LinearSearch();

        assertEquals(targetIndex, search.search(arr, target));
    }

}