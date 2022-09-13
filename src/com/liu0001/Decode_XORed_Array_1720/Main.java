package com.liu0001.Decode_XORed_Array_1720;

/*
1720. Decode XORed Array

There is a hidden integer array
arr that consists of n non-negative integers.

It was encoded into another integer array encoded of
length n - 1, such that encoded[i] = arr[i] XOR arr[i + 1].
For example, if arr = [1,0,2,1], then encoded = [1,2,3].

You are given the encoded array. You are also given an
integer first, that is the first element of arr, i.e. arr[0].

Return the original array arr. It can be proved that the answer
exists and is unique.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] encoded = {6, 2, 7, 3};
        int first = 4;      // Output: [4,2,0,7,4]
        int[] ans = solution.decode(encoded, first);
        for (int i = 0; i < ans.length; i++) {

            System.out.println(ans[i]);
        }
    }
}


class Solution {
    public int[] decode(int[] encoded, int first) {

        int[] ans = new int[encoded.length+1];
        ans[0] = first;

        for (int i = 0; i < encoded.length; i++) {

            ans[i+1] = ans[i] ^ encoded[i];

        }
        return ans;
    }
}