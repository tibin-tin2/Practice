package com.tibin.practice.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedStringTest {

    @Test
    public void test() {
        String str = "abcabcabcaaabbc";
        String expectedStr = "aaaaaabbbbbcccc";

        SortedString sortedString = new SortedString();
        assertEquals(expectedStr, sortedString.getSortedString(str));
    }

    @Test
    public void test1() {
        String str = "abc";
        String expectedStr = "abc";

        SortedString sortedString = new SortedString();
        assertEquals(expectedStr, sortedString.getSortedString(str));
    }

    @Test
    public void test2() {
        String str = "aabc";
        String expectedStr = "aabc";

        SortedString sortedString = new SortedString();
        assertEquals(expectedStr, sortedString.getSortedString(str));
    }

    @Test
    public void test3() {
        String str = "abbccc";
        String expectedStr = "cccbba";

        SortedString sortedString = new SortedString();
        assertEquals(expectedStr, sortedString.getSortedString(str));
    }

    @Test
    public void test4() {
        String str = "abbcc";
        String expectedStr = "bbcca";

        SortedString sortedString = new SortedString();
        assertEquals(expectedStr, sortedString.getSortedString(str));
    }

}