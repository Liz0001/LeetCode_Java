package com.liu0001.Two_Sum_1;

/*
1. Two Sum from Leetcode.

Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
and you may not use the same element twice.

You can return the answer in any order.
*/


public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};    //  output: {0,1}
        int target = 9;

        int[] ans = solution.twoSum(nums, target);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
