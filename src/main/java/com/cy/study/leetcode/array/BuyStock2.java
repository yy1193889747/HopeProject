package com.cy.study.leetcode.array;

/**
 * 买卖股票的最佳时机2
 * 输入: prices = [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出, 这笔交易所能获得利润 = 5-1 = 4 。
 * 随后，在第 4 天（股票价格 = 3）的时候买入，在第 5 天（股票价格 = 6）的时候卖出, 这笔交易所能获得利润 = 6-3 = 3 。
 */
public class BuyStock2 {

    /**
     * （不限交易次数）纪录所有上涨的和
     *
     * @param arr 数组
     * @return
     */
    private int maxProfit(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return 0;
        }
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                maxProfit += arr[i] - arr[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        BuyStock2 buyStock2 = new BuyStock2();
        System.out.println(buyStock2.maxProfit(arr));
    }
}
