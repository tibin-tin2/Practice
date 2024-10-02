package com.tibin.practice.strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindSequenceTest {

    @Test
    public void test() {
        FindSequence findSequence = new FindSequence();
        String str = "8 2 3 4 a b c -5 -3 -2 -1";
        List<List<Integer>> expectedList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();
        list2.add(-3);
        list2.add(-2);
        list2.add(-1);

        expectedList.add(list1);
        expectedList.add(list2);

        List<List<Integer>> sequence = findSequence.findSequence(str);

        assertEquals(expectedList, sequence);
    }

}