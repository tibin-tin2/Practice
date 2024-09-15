package com.tibin.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxStockPriceTest {

    @Test
    public void testMaxProfit() {
        int prices[] = {6, 1, 5, 6, 1, 8, 7};
        int exprectMaxProfit = 7;

        MaxStockPrice maxStockPrice = new MaxStockPrice();
        assertEquals(exprectMaxProfit, maxStockPrice.maxProfit(prices));
    }

    @Test
    public void testMaxProfit1() {
        int prices[] = {1, 1, 12, 1, 1, 13, 7};
        int exprectMaxProfit = 12;

        MaxStockPrice maxStockPrice = new MaxStockPrice();
        assertEquals(exprectMaxProfit, maxStockPrice.maxProfit(prices));
    }

    @Test
    public void testMaxProfitWithNoProfit() {
        int prices[] = {12, 11, 10, 9, 8 , 7, 6, 5, 4};
        int exprectMaxProfit = 0;

        MaxStockPrice maxStockPrice = new MaxStockPrice();
        assertEquals(exprectMaxProfit, maxStockPrice.maxProfit(prices));
    }

}