package com.tibin.practice.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Ques :</b> find the next sequence of numbers from the given String input.
 * input can contain integer, character, special character, etc..
 *
 * <br><br>
 * See {@link com.tibin.practice.strings.FindSequenceTest FindSequenceTest} for the test results.
 */

public class FindSequence {

    public List<List<Integer>> findSequence(String str) {
        String[] split = str.split(" ");
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentSequence = new ArrayList<>();

        for (String s : split) {
            try {
                Integer integer = Integer.valueOf(s);
                if (currentSequence.isEmpty()) {
                    currentSequence.add(integer);
                } else if (currentSequence.get(currentSequence.size() - 1) + 1 == integer) {
                    currentSequence.add(integer);
                } else {
                    currentSequence = new ArrayList<>();
                    currentSequence.add(integer);
                }
            } catch (Exception e) {
                if (currentSequence.size() > 1)
                    result.add(currentSequence);
                currentSequence = new ArrayList<>();
            }
        }
        if (currentSequence.size() > 1)
            result.add(currentSequence);
        return result;
    }
}
