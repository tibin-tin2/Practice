package com.tibin.practice.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <b>Ques :</b> Given two strings s and t of lengths m and n respectively,
 * return the minimum window substring of s such that every character in t (including duplicates)
 * is included in the window. If there is no such substring,return the empty string "".
 *
 * <br><br>
 * See {@link com.tibin.practice.strings.MinimumWindowSubstringTest MinimumWindowSubstringTest} for the test cases.
 */

public class MinimumWindowSubstring {

    public String minimumSubstring(String s, String t) {
        int m = s.length();
        int n = t.length();
        int first = 0;
        String result = "";

        Map<Character, Integer> sMap = new HashMap<>();

        for (int end = t.length() - 1; end < s.length(); end++) {
            String substring = s.substring(first, end + 1);
            while (isAllElementsPresent(t, substring) && substring.length() >= t.length()) {
                if (result == "") {
                    result = substring;
                } else {
                    int minSize = Math.min(result.length(), substring.length());
                    result = substring.length() == minSize ? substring : result;
                }
                first++;
                substring = s.substring(first, end + 1);
            }
        }

        return result;

    }

    private boolean isAllElementsPresent(String t, String substring) {
        Set<Character> substringSet = new HashSet<>();
        for (char ch : substring.toCharArray()) {
            substringSet.add(ch);
        }

        for (char ch : t.toCharArray()) {
            if (!substringSet.contains(ch)) {
                return false;
            }
        }

        return true;
    }
}
