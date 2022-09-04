package com.liu0001.Number_of_Good_Pairs_1512;

/*
1512. Number of Good Pairs

Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
//        int[] nums = {1, 2, 3, 1, 1, 3};        // Output: 4
        int[] nums = {1, 1, 1, 1};              // Output: 6
        int ans = solution.numIdenticalPairs(nums);
        System.out.println(ans);

    }
}



class Solution {
    public int numIdenticalPairs(int[] nums) {

        int count = 0;
        for (int i = 0; i <nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }
        return count;
    }
}