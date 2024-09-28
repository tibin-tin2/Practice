package com.tibin.practice.searching;

/**
 * <b>Linear Search</b>
 * <br><br>
 * See {@link com.tibin.practice.searching.LinearSearchTest LinearSearchTest} for the test cases.
 */
public class LinearSearch implements Search {

    @Override
    public int search(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (target == arr[i])
                return i;
        }
        return -1;
    }
}
