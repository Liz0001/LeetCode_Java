package com.liu0001.Shuffle_the_Array_1470;

/*
1470. Shuffle the Array from Leetcode.

Given the array nums consisting of 2n elements
in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */


public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {2,5,1,3,4,7};
        int n = 3;          // Output: [2,3,5,4,1,7]
        int[] ans = solution.shuffle(nums, n);
        for (int a : ans) {
            System.out.println(a);
        }

    }
}


class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] nums2 = new int[nums.length];
        int c = 0;
        for (int i = 0; i < nums.length; i += 2) {
            nums2[i] = nums[c];
            nums2[i+1] = nums[c+n];
            c++;
        }
        return nums2;
    }
}