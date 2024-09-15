package com.tibin.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class NextLexicographicPermutationTest {

    @Test
    public void testNextMaxPermutation() {
        int[] nums = {4, 5, 3, 1};
        int[] expectedNums = {5, 1, 3, 4};
        NextLexicographicPermutation nextLexicographicPermutation = new NextLexicographicPermutation();
        assertArrayEquals(expectedNums, nextLexicographicPermutation.nextPermutation(nums));
    }

    @Test
    public void testNextMaxPermutation1() {
        int[] nums = {1, 2, 3};
        int[] expectedNums = {1, 3, 2};
        NextLexicographicPermutation nextLexicographicPermutation = new NextLexicographicPermutation();
        assertArrayEquals(expectedNums, nextLexicographicPermutation.nextPermutation(nums));
    }

    @Test
    public void testNextMaxPermutation2() {
        int[] nums = {3, 2, 1};
        int[] expectedNums = {1, 2, 3};
        NextLexicographicPermutation nextLexicographicPermutation = new NextLexicographicPermutation();
        assertArrayEquals(expectedNums, nextLexicographicPermutation.nextPermutation(nums));
    }

    @Test
    public void testNextMaxPermutation3() {
        int[] nums = {5, 4, 7, 5, 3, 2};
        int[] expectedNums = {5, 5, 2, 3, 4, 7};
        NextLexicographicPermutation nextLexicographicPermutation = new NextLexicographicPermutation();
        assertArrayEquals(expectedNums, nextLexicographicPermutation.nextPermutation(nums));
    }

    @Test
    public void testNextMaxPermutation4() {
        int[] nums = {6, 2, 1, 5, 4, 3, 0};
        int[] expectedNums = {6, 2, 3, 0, 1, 4, 5};
        NextLexicographicPermutation nextLexicographicPermutation = new NextLexicographicPermutation();
        assertArrayEquals(expectedNums, nextLexicographicPermutation.nextPermutation(nums));
    }


}