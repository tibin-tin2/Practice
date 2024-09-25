package com.tibin.practice.strings;

/** <b>Ques:</b> Write a function that reverse a string.
 * The input string is given as an array of character s.
 * You must do this by modifying the input array inplace with O(1) extra memory.
 *<br><p></p>
 * See {@link com.tibin.practice.strings.StringReverseTest StringReverseTest} for test cases.
 */

public class StringReverse {

    public char[] reverse(char[] s) {
        int n = s.length;
        int start = 0;
        int end = n - 1;
        int mid = (n - 1) / 2;

        while (start <= mid && end >=mid ) {
            char t = s[start];
            s[start] = s[end];
            s[end] = t;

            start++;
            end--;
        }
        return s;
    }
}
