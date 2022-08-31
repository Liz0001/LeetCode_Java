package com.liu0001.Running_Sum_of_1d_Array_1480;

/*
* 1480. Running Sum of 1d Array from Leetcode.
*
* Given an array nums. We define a running sum
* of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.
* */


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {1, 2, 3, 4};  // Output: [1,3,6,10]
        int[] nums = {1, 1, 1, 1, 1};   // Output: [1,2,3,4,5]
        int[] ans = solution.runningSum(nums);
        for (int a: ans) {
            System.out.println(a);
        }



    }
}


class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}