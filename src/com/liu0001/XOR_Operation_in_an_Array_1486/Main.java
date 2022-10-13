package com.liu0001.XOR_Operation_in_an_Array_1486;

/*
1486. XOR Operation in an Array

You are given an integer n and an integer start.

Define an array nums where nums[i] = start + 2 * i
(0-indexed) and n == nums.length.

Return the bitwise XOR of all elements of nums.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int ans = solution.xorOperation(4, 3);
        System.out.println(ans);
    }
}

class Solution {
    public int xorOperation(int n, int start) {
        int ans = start;
        for (int i = 1; i < n; i++) {
            ans = ans ^ (start + 2 * i);
        }
        return ans;
    }
}