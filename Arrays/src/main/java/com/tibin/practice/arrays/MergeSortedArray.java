package com.tibin.practice.arrays;

/**
 * <b>Ques :</b> You are given two integer arrays nums1 and nums2,
 * sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 an nums2 into a single array sorted in non-decreasing order.
 *
 * <br><br>
 *
 * See {@link com.tibin.practice.arrays.MergeSortedArrayTest MergeSortedArrayTest} for the test cases.
 */

public class MergeSortedArray {

    public int[] merge(int[] arr1, int[] arr2, int n1, int n2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] resultArr = new int[n1 + n2];

        while(i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                resultArr[k] = arr1[i];
                i++;
            } else {
                resultArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            resultArr[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            resultArr[k] = arr2[j];
            j++;
            k++;
        }
        return resultArr;
    }
}
