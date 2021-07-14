package com.cy.study.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 5, 7, 8};
        int[] ints = sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(ints));

    }


    private static int[] sort(int[] arr, int begin, int end) {
        if (end - begin < 2) {
            return null;
        }
        int mid = pivotIndex(arr, begin, end);
        sort(arr, begin, mid);
        sort(arr, mid + 1, end);
        return arr;

    }

    private static int pivotIndex(int[] arr, int begin, int end) {
        int pivot = arr[begin];
        end--;
        while (begin < end) {
            while (begin < end) {
                if (pivot < arr[end]) {
                    end--;
                } else {
                    arr[begin++] = arr[end];
                    break;
                }
            }
            while (begin < end) {
                if (pivot > arr[begin]) {
                    begin++;
                } else {
                    arr[end--] = arr[begin];
                    break;
                }
            }
        }
        arr[begin] = pivot;
        return begin;

    }

    static int[] quick_sort(int s[], int l, int r) {
        if (l < r) {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if (i < j)
                    s[i++] = s[j];

                while (i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
        return s;
    }


}
