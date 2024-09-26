package com.tibin.practice.sorting;

/**
 * <b>Insertion Sort</b>
 * <p>
 * See {@link com.tibin.practice.sorting.InsertionSortTest InsertionSortTest} for the test cases.
 */
public class InsertionSort implements Sort {

    @Override
    public int[] sort(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] < nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
        return nums;
    }
}
