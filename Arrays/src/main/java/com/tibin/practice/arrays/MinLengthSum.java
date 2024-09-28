package com.tibin.practice.arrays;

/**
 * <b>Ques :</b> Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a subarray whose sum is greater than or equal to target.
 * if there is no such subarray, return 0 instead.
 *
 * <br><br>
 * See {@link com.tibin.practice.arrays.MinLengthSumTest MinLengthSumTest} for testcases
 */
public class MinLengthSum {

    public int findMinLengthSum(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;

        for (int end = 0; end < n; end++) {
            currentSum += arr[end];

            while (currentSum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= arr[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
