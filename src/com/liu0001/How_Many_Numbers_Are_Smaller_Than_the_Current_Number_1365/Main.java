package com.liu0001.How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365;

/*
1365. How Many Numbers Are Smaller Than the Current Number.

Given the array nums, for each nums[i] find out how many numbers in
the array are smaller than it. That is, for each nums[i] you have to
count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {8,1,2,2,3};       // Output: [4,0,1,1,3]

        int[] ans = solution.smallerNumbersThanCurrent(nums);
        for (int a: ans) {
            System.out.println(a);
        }

    }
}


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i] && i != j) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}