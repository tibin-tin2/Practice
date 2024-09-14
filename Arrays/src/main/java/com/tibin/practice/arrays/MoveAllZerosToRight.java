package com.tibin.practice.arrays;

/**
 * <b>Ques:</b> Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Not that you must do this in-place without making a copy of the array.
 *
 * <br><br>
 * <p>
 * See {@link com.tibin.practice.arrays.MoveAllZerosToRightTest MoveAllZerosToRightTest} for the test cases
 */
public class MoveAllZerosToRight {

    public int[] shift(int[] nums) {
        int i = 0;
        int n = nums.length;

        while (i < n) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[j] != 0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
            i++;
        }

        return nums;
    }
}
