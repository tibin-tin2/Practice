package com.tibin.practice.searching;

/**
 * <b>Binary Search</b>
 * <br><br>
 * See {@link com.tibin.practice.searching.BinarySearchTest BinarySearchTesth} for the test cases.
 */
public class BinarySearch implements Search {

    @Override
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        return search(arr, left, right, target);
    }


    public int search(int[] arr, int left, int right, int target) {
        if (left > right)
            return  -1;
        int n = (right - left) + 1;
        int mid = left + (right - left) / 2;

        if(arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return search(arr, left, mid - 1, target);
        } else {
            return search(arr, mid + 1, right, target);
        }
    }
}
