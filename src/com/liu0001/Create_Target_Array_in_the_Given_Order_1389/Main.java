package com.liu0001.Create_Target_Array_in_the_Given_Order_1389;

/*
1389. Create Target Array in the Given Order

Given two arrays of integers nums and index.
Your task is to create target array under the following rules:

Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i]
the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.

It is guaranteed that the insertion operations will be valid.

 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};      // Output: [0,1,2,3,4]

        int[] ans = solution.createTargetArray(nums, index);
        for (int a: ans) {
            System.out.println(a);
        }

    }
}


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < index.length; i++) {
            arr.add(index[i], nums[i]);
        }

        for (int j = 0; j < ans.length; j++) {
            ans[j] = arr.get(j);
        }

        return ans;
    }
}