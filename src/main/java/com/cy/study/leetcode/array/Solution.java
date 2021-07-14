package com.cy.study.leetcode.array;

import java.util.Arrays;

/**
 * 删除排序数组中的重复项
 */
public class Solution {
    /**
     * 使用双指针
     *
     * @param nums 数组
     * @return
     */
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }

    public int removeDuplicatesTwo(int[] nums) {
        int count = nums.length;
        int i = 1;
        int j = 1;
        while (i < count) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                ++j;
            }
            ++i;

        }

        return j;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 1, 5, 5, 33, 35};
        int x = solution.removeDuplicates(arr);
        for (int i = 0; i < x; i++) {
            System.out.println(arr[i]);
        }

    }

}
