package com.tibin.practice.strings;

import java.util.*;

/**
 * Given a string s, sorted it in a decreasing order based on the frequency of tye characters.
 * The frequency of the character is the number of times it appears in the string.
 * Return the sorted string. If there are multiple answers, return any one of them.
 *
 * <br><br>
 * See {@link com.tibin.practice.strings.SortedStringTest SortedStringTest} for the test cases.
 */


public class SortedString {

    /**
     * 1. iterate through the list and find the characters and its count<br>
     * 2. store the character and its count to a hashmap<br>
     * 3. sort the hashmap based on the value.<br>
     * 4. print each character based on the value.<br>
     */


    public String getSortedString(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            Integer charVal = charCount.get(c);
            if (charVal == null) {
                charCount.put(c, 1);
            } else {
                charCount.put(c, ++charVal);
            }
        }

        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(charCount.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
