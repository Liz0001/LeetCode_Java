package com.liu0001.Subtract_the_Product_and_Sum_of_Digits_of_an_Integer_1281;

/*
1281. Subtract the Product and Sum of Digits of an Integer.

Given an integer number n, return the difference between
the product of its digits and the sum of its digits.

 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int n = 4421;        // Output: 21

        int ans = solution.subtractProductAndSum(n);
        System.out.println(ans);

    }

}

class Solution {
    public int subtractProductAndSum(int n) {

        int mult = 1;
        int sm = 0;

        while (n > 0) {
            mult = mult * (n % 10);
            sm = sm + (n % 10);
            n = n / 10;
        }

        return (mult - sm);
    }
}