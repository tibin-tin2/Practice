package com.tibin.practice.strings;

/**
 * Given a roman numeral, convert it to integer.
 *
 * <br><br>
 * See {@link com.tibin.practice.strings.RomanNumbersToIntegerTest RomanNumbersToIntegerTest} for more tests.
 */

public class RomanNumbersToInteger {

    /**
     *
     * I - 1
     * V - 5
     * X - 10
     * L - 50
     * C - 100
     * D - 500
     * M - 1000
     */

    public Integer getIntegerFromRoman(String romanNumbers) {
        int result = 0;
        int prevInt = -1;
        for (int i = 0; i < romanNumbers.length(); i++) {
            int romanInt = getInt(romanNumbers.charAt(i));
            if (romanInt != -1) {
                if (romanInt > prevInt && prevInt != -1) {
                    result += romanInt - prevInt * 2;
                } else {
                    result += romanInt;
                }
                prevInt = romanInt;
            }
        }

        return result;
    }

    private int getInt(char ch) {
        try {
            return RomanInteger.valueOf(String.valueOf(ch)).getNumber();
        } catch (Exception e) {
            return -1;
        }
    }
}

enum RomanInteger {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    final int number;

    RomanInteger(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
