package com.liu0001.Build_Array_from_Permutation_1920;

/**
 * 1920. Build Array from Permutation from Leetcode.
 *
 * Given a zero-based permutation nums (0-indexed),
 * build an array ans of the same length where
 * ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 *
 * A zero-based permutation nums is an array of distinct integers
 * from 0 to nums.length - 1 (inclusive).
 */



public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {0, 2, 1, 5, 3, 4};
//        Output: [0,1,2,4,5,3]

        int[] arr = solution.buildArray(nums);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Solution {
    public int[] buildArray(int[] nums) {

        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            int num = nums[nums[i]];
            ans[i] = num;
        }
        return ans;
    }
}