package com.liu0001.Sum_of_All_Odd_Length_Subarrays_1588;

/*
1588. Sum of All Odd Length Subarrays

Given an array of positive integers arr, return the sum
of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        int[] arr = {1,4,2,5,3};    // output: 58
        int ans = sol.sumOddLengthSubarrays(arr);
        System.out.println(ans);
    }
}


class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int[] arr2;
        int size = 1;
        int count = 0;

        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (size > arr.length) break;
                arr2 = new int[size];
                arr2 = Arrays.copyOfRange(arr, j, (j+size));
                if (arr2[size-1] == 0) continue;

                for (int k = 0; k < arr2.length; k++) {
                        count = count + arr2[k];
                }
            }
            size = size + 2;
        }

        return count;
    }
}