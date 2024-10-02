package com.tibin.practice.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    @Test
    public void testMinWindowSubstring() {
        String s = "aebcdefghi";
        String t = "ab";
        String expectedStr = "aeb";

        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        assertEquals(expectedStr, minimumWindowSubstring.minimumSubstring(s, t));
    }

    @Test
    public void testMinWindowSubstring1() {
        String s = "aebcdefghiabedcabc";
        String t = "abc";
        String expectedStr = "abc";

        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        assertEquals(expectedStr, minimumWindowSubstring.minimumSubstring(s, t));
    }

    @Test
    public void testMinWindowSubstringNegative() {
        String s = "aebcdefghiabedcabc";
        String t = "tuv";
        String expectedStr = "";

        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        assertEquals(expectedStr, minimumWindowSubstring.minimumSubstring(s, t));
    }

    @Test
    public void testMinWindowSubstring2() {
        String s = "abc";
        String t = "abc";
        String expectedStr = "abc";

        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        assertEquals(expectedStr, minimumWindowSubstring.minimumSubstring(s, t));
    }

    @Test
    public void testMinWindowSubstring3() {
        String s = "";
        String t = "abc";
        String expectedStr = "";

        MinimumWindowSubstring minimumWindowSubstring = new MinimumWindowSubstring();
        assertEquals(expectedStr, minimumWindowSubstring.minimumSubstring(s, t));
    }
}