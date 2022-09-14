package com.liu0001.Decompress_Run_Length_Encoded_List_1313;

/*
1313. Decompress Run-Length Encoded List

We are given a list nums of integers representing a
list compressed with run-length encoding.

Consider each adjacent pair of elements
[freq, val] = [nums[2*i], nums[2*i+1]] (with i >= 0).
For each such pair, there are freq elements with value val
concatenated in a sublist. Concatenate all the sublists from
left to right to generate the decompressed list.

Return the decompressed list.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {1,1,2,3};
        int[] ans = solution.decompressRLElist(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}


class Solution {
    public int[] decompressRLElist(int[] nums) {
        int cc = 0;
        for (int i = 0; i < nums.length; i+=2) {
            cc += nums[i];
        }
        int ans[] = new int[cc];
        cc = 0;

        for (int i = 0; i < nums.length; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                ans[cc] = nums[i+1];
                cc++;
            }
        }
        return ans;
    }
}