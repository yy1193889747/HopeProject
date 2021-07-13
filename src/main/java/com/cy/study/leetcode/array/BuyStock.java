package com.cy.study.leetcode.array;

public class BuyStock {

    public static void main(String[] args) {
        int[] a = {7, 6, 4, 3, 1};
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] - a[i] > max) {
                    max = a[j] - a[i];
                }
            }
        }
        System.out.println(max);
    }
}
