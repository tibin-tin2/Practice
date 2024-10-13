package com.tibin.practice.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumbersToIntegerTest {

    @Test
    public void test() {
        String romanNumbers = "III";
        int expectedNumber = 3;

        RomanNumbersToInteger romanNumbersToInteger = new RomanNumbersToInteger();

        assertEquals(expectedNumber, romanNumbersToInteger.getIntegerFromRoman(romanNumbers));
    }

    @Test
    public void testWithLowerNumberOnLeft() {
        String romanNumbers = "XIV";
        int expectedNumber = 14;

        RomanNumbersToInteger romanNumbersToInteger = new RomanNumbersToInteger();

        assertEquals(expectedNumber, romanNumbersToInteger.getIntegerFromRoman(romanNumbers));
    }

    @Test
    public void testWithLowerNumberOnLeft1() {
        String romanNumbers = "XXIV";
        int expectedNumber = 24;

        RomanNumbersToInteger romanNumbersToInteger = new RomanNumbersToInteger();

        assertEquals(expectedNumber, romanNumbersToInteger.getIntegerFromRoman(romanNumbers));
    }

}