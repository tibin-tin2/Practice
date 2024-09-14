package com.tibin.practice.arrays;
/**
 * <b>Ques:</b> Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * <br><br>
 *
 * See {@link com.tibin.practice.arrays.SumOfAllElementsExceptCurrentTest SumOfAllElementsExceptCurrentTest} for test cases
 */
public class ProductOfAllElementsExceptCurrent {
    public int[] productArr(int[] nums) {
        int maxProduct = 1;
        int[] maxProductArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            maxProduct *= nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            maxProductArr[i] = maxProduct / nums[i];
        }

        return maxProductArr;
    }
}
