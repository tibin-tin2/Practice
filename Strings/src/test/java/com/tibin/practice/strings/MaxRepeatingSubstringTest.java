package com.tibin.practice.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxRepeatingSubstringTest {

    @Test
    public void test() {
        String str = "ABAB";
        int k = 2;
        int expectedResult = 4;
        MaxRepeatingSubstring maxRepeatingSubstring = new MaxRepeatingSubstring();
        assertEquals(expectedResult, maxRepeatingSubstring.findMaxLength(str, k));
    }

    @Test
    public void test123() {
        String str = "ABABC131";
        int k = 3;
        int expectedResult = 5;
        MaxRepeatingSubstring maxRepeatingSubstring = new MaxRepeatingSubstring();
        assertEquals(expectedResult, maxRepeatingSubstring.findMaxLength(str, k));
    }


}