package com.tibin.practice.arrays;

/**
 * <b>Ques:</b> The next permutation of an array of integers is the next lexicographically greater permutation of its integer.
 * Given an array of integers nums, find the next permutation of nums.
 * The replacement must be in place and use only constant extra memory.
 * <p>
 * See {@link com.tibin.practice.arrays.NextLexicographicPermutationTest NextLexicographicPermutationTest} for test cases.
 */
public class NextLexicographicPermutation {

    public int[] nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
            i--;
        }
        int maxIndex = i + 1;
        if (i != -1) {
            for (int j = i + 1; j < n - 1; j++) {
                if (nums[i] < nums[j] && nums[j] < nums[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
        int j = i + 1;
        int k = n - 1;

        while (j < n && k > i && j < k) {
            int temp = nums[j];
            nums[j] = nums[k];
            nums[k] = temp;
            j++;
            k--;
        }

        return nums;
    }
}
