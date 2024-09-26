package com.tibin.practice.sorting;

/**
 * <b>Selection Sort</b>
 * <p>
 * See {@link com.tibin.practice.sorting.SelectionSortTest SelectionSortTest} for the test cases.
 */

public class SelectionSort implements Sort {

    @Override
    public int[] sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }
}
