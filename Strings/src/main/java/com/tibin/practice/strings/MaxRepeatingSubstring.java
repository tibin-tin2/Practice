package com.tibin.practice.strings;

/**
 *You are given a string s and an integer k.
 * You can choose any character of the string and change it to any other uppercase English character.
 * You can perform this operation at most k times.
 * Return the length of the longest substring containing
 * the same letter you can get after performing the above operations.
 *
 * <br><br>
 * See {@link com.tibin.practice.strings.MaxRepeatingSubstringTest MaxRepeatingSubstringTest} for the test cases.
 */

public class MaxRepeatingSubstring {

    public int findMaxLength(String s, int k) {
        int ans = 0;
        int n = s.length();
        for (char c = 'A'; c <= 'Z'; c++) {
            int i = 0, j = 0, replaced = 0;
            while (j < n) {
                if (s.charAt(j) == c) {
                    j++;
                } else if (replaced < k) {
                    j++;
                    replaced++;
                } else if (s.charAt(i) == c) {
                    i++;
                } else {
                    i++;
                    replaced--;
                }
                ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }
}
