package com.liu0001.Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits_2160;

/*
2160. Minimum Sum of Four Digit Number After Splitting Digits.

You are given a positive integer num consisting of exactly four digits.
Split num into two new integers new1 and new2 by using the digits found in num.
Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.

For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3.
Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
Return the minimum possible sum of new1 and new2.
 */


import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
//        int num = 2932;     // Output: 52
        int num = 4009;     // Output: 13

        int ans = solution.minimumSum(num);
        System.out.println(ans);

    }
}


class Solution {
    public int minimumSum(int num) {

        int a = num / 1000;
        int b = (num-(a*1000)) / 100;
        int c = (num-(a*1000 + b*100)) / 10;
        int d = (num-(a*1000 + b*100 + c*10));
        int[] arr = {a, b, c, d};

        Arrays.sort(arr);

        int pair1 = Integer.valueOf(String.valueOf(arr[0]) + String.valueOf(arr[3]));
        int pair2 = Integer.valueOf(String.valueOf(arr[1]) + String.valueOf(arr[2]));

        int ans = pair1 + pair2;

        return ans;
    }
}