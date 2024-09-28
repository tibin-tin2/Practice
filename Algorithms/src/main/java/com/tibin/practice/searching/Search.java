package com.tibin.practice.searching;

public interface Search {
    /**
     * Find an element from then array and return its index if it is present.
     * Return -1 if the target is not found in the result
     * @param arr : Accespt an int array
     * @param target : Element to be find in the array
     * @return index of the target in the array
     */
    public int search (int[] arr, int target);
}
