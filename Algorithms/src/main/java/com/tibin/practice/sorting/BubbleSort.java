package com.tibin.practice.sorting;

/**
 * <b>BubbleSort</b>
 * <p>
 * See {@link com.tibin.practice.sorting.BubbleSortTest BubbleSortTest} for the test cases.
 */

public class BubbleSort implements Sort{

    @Override
    public int[] sort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1 ; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1 ] = temp;
                }
            }
        }
        return nums;
    }
}
