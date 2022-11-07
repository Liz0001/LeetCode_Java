package com.liu0001.Minimum_Bit_Flips_to_Convert_Number_2220;

/*
2220. Minimum Bit Flips to Convert Number.

A bit flip of a number x is choosing a bit in the binary representation
of x and flipping it from either 0 to 1 or 1 to 0.

For example, for x = 7, the binary representation is 111 and we may choose
any bit (including any leading zeros not shown) and flip it. We can flip
the first bit from the right to get 110, flip the second bit from the right
to get 101, flip the fifth bit from the right (a leading zero) to get 10111, etc.
Given two integers start and goal, return the minimum number
of bit flips to convert start to goal.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int start = 3, goal = 4;
        int ans = solution.minBitFlips(start, goal);
        System.out.println(ans);

    }
}



class Solution {
    public int minBitFlips(int start, int goal) {

        String start_bit = Integer.toBinaryString(start);
        String goal_bit = Integer.toBinaryString(goal);
        for (int i = goal_bit.length(); i < start_bit.length(); i++) {
            goal_bit = "0" + goal_bit;
        }
        for (int i = start_bit.length(); i < goal_bit.length(); i++) {
            start_bit = "0" + start_bit;
        }
        char[] goal_bits = goal_bit.toCharArray();
        char[] start_bits = start_bit.toCharArray();
        int diff = 0;

        for (int i = 0; i < goal_bits.length; i++) {
            if (start_bits[i] != goal_bits[i]) diff++;
        }

        return diff;
    }
}