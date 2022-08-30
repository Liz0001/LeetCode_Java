package com.liu0001.Concatenation_of_Array_1929;

/*
1929. Concatenation of Array from Leetcode.

Given an integer array nums of length n,
you want to create an array ans of length 2n
where ans[i] == nums[i] and ans[i + n] == nums[i]
for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.
Return the array ans.
*/

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 3, 2, 1};
//        Output: [1,3,2,1,1,3,2,1]

        int[] ans = sol.getConcatenation(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length + nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
