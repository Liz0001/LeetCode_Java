package com.liu0001.Number_of_Steps_to_a_Number_to_Zero_1342;

/*
1342. Number of Steps to Reduce a Number to Zero

Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2,
otherwise, you have to subtract 1 from it.
 */

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        int num = 123;

        int ans = sol.numberOfSteps(num);
        System.out.println(ans);
    }
}


class Solution {
    public int numberOfSteps(int num) {
        int ans = 0;

        while (num >= 1) {
            if (num % 2 == 0) {
                num = num / 2;
                ans++;
            } else {
                num--;
                ans++;
            }
        }
        return ans;
    }
}