package com.liu0001.Smallest_Even_Multiple_2413;

/*
2413. Smallest Even Multiple

Given a positive integer n, return the smallest positive
integer that is a multiple of both 2 and n.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int ans1 = solution.smallestEvenMultiple(5);    // 10
        System.out.println(ans1);
        int ans2 = solution.smallestEvenMultiple(6);    // 6
        System.out.println(ans2);

    }
}


class Solution {
    public int smallestEvenMultiple(int n) {

        if (n%2 == 0) return n;

        return n*2;
    }
}