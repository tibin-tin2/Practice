package com.tibin.practice.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReverseTest {

    @Test
    public void testStringRevese() {
        char[] s = {'a', 'b', 'c', 'd'};
        char[] expectedS = {'d', 'c', 'b', 'a'};

        StringReverse stringReverse = new StringReverse();
        assertArrayEquals(expectedS, stringReverse.reverse(s));
    }

    @Test
    public void testStringRevesePallindrome() {
        char[] s = {'a', 'b', 'c', 'b', 'a'};
        char[] expectedS = {'a', 'b', 'c', 'b', 'a'};

        StringReverse stringReverse = new StringReverse();
        assertArrayEquals(expectedS, stringReverse.reverse(s));
    }



}