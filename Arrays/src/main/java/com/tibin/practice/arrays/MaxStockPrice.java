package com.tibin.practice.arrays;

/**
 * <b>Ques:</b> You are given an array of prices where prices[i] is the price of a given stock on an ith day.
 * You want to maximise your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * <br><br>
 *
 * See {@link com.tibin.practice.arrays.MaxStockPriceTest MaxStockPriceTest} for the test cases.
 */
public class MaxStockPrice {

    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i; j < prices.length; j++) {
                int diff = prices[j] - prices[i];
                if (diff > profit) {
                    profit = diff;
                }
            }
        }
        return profit;
    }
}
