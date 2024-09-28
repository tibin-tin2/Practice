package com.tibin.practice.arrays;

import com.tibin.practice.util.ArrayPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    public void test() {
        int[] arr1 = {1, 3, 5, 7, 9, 11};
        int[] arr2 = {2, 4, 6, 8, 10, 12};
        int[] expectedArr = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12};

        MergeSortedArray mergeSortedArray = new MergeSortedArray();

        assertArrayEquals(expectedArr, mergeSortedArray.merge(arr1, arr2, arr1.length, arr2.length));
    }

    @Test
    public void test1() {
        int[] arr1 = {1, 3, 5, 5, 9, 11};
        int[] arr2 = {2, 4, 6, 8, 9, 12};
        int[] expectedArr = {1, 2, 3, 4, 5, 5, 6, 8 ,9, 9, 11, 12};

        MergeSortedArray mergeSortedArray = new MergeSortedArray();

        assertArrayEquals(expectedArr, mergeSortedArray.merge(arr1, arr2, arr1.length, arr2.length));
    }

}