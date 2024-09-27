package com.tibin.practice.sorting;


/**
 * <b>MergeSort</b>
 * <br><br>
 * See {@link com.tibin.practice.sorting.MergeSortTest MergeSortTest} for the test cases.
 */
public class MergeSort implements Sort {
    @Override
    public int[] sort(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n - 1;
        return sort(nums, left, right);
    }

    public int[] sort(int[] arr, int left, int right) {
        if (!(left < right)) {
            return new int[0];
        }

        int n = arr.length;
        int mid = (n - 1) / 2;

        sort(arr, left, mid);
        sort(arr, mid + 1, right);

        return merge(arr, left, mid, right);
    }

    int[] merge(int[] arr, int left, int mid, int right) {

        int n1 = (mid - left) + 1;
        int n2 = (right - (mid + 1)) + 1;

        int i = 0;
        int j = 0;
        int k = 0;
        int[] sortedArr = new int[n1 + n2];

        // compare two array and place smalled item on the result array
        while (i < n1 && j < n2) {
            if (arr[i] < arr[j]) {
                sortedArr[k] = arr[i];
                i++;
            } else {
                sortedArr[k] = arr[j];
                j++;
            }
            k++;
        }


        // copy remaining values to the result array
        while (i < n1) {
            sortedArr[k] = arr[i];
            i++;
            k++;
        }

        while (j < n2) {
            sortedArr[k] = arr[j];
            j++;
            k++;
        }

        return sortedArr;

    }

}
