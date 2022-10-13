package com.liu0001.Number_of_Arithmetic_Triplets_2367;

/*
2367. Number of Arithmetic Triplets

You are given a 0-indexed, strictly increasing integer
array nums and a positive integer diff. A triplet (i, j, k)
is an arithmetic triplet if the following conditions are met:

i < j < k,
nums[j] - nums[i] == diff, and
nums[k] - nums[j] == diff.
Return the number of unique arithmetic triplets.
 */

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
        int ans = solution.arithmeticTriplets(nums, diff);
        System.out.println(ans);

    }
}


class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (i != j && j != k && (nums[j] - nums[i]) == diff && (nums[k] - nums[j]) == diff) {
//                        System.out.println(i + " " + j + " " + k);
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
}