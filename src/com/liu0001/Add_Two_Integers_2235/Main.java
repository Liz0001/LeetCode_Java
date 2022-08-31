package com.liu0001.Add_Two_Integers_2235;
/*
* 2235. Add Two Integers from Leetcode.
*
* Given two integers num1 and num2,
* return the sum of the two integers.
* */

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int num1 = 12;
        int num2 = 5;

        int ans = solution.sum(num1, num2);
        System.out.println(ans);
    }
}


class Solution {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}