package com.liu0001.Two_Sum_1;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                int x = nums[i] + nums[j];
                if (x == target && (i != j)) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}
