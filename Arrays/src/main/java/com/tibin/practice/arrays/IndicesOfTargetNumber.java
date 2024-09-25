package com.tibin.practice.arrays;

/**
 * <b>Ques:</b> Given an array of integers and an integer target, return indices of the two numbers such that they add up to target
 * <br><p>
 * See {@link com.tibin.practice.arrays.IndicesOfTargetNumberTest IndicesOfTargetNumberTest} for test cases.
 */
public class IndicesOfTargetNumber {

    public String findTargetIndices(int[] nums, int target) {
        boolean isTargetFound = false;
        int i = 0;
        int j = 0;
        while (i < nums.length) {

            j = i + 1;
            while (j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    isTargetFound = true;
                    break;
                }
                j++;
            }
            if (isTargetFound)
                break;
            i++;
        }
        return i + ", " + j;
    }
}
