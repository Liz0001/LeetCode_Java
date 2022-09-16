package com.liu0001.Shuffle_String_1528;

/*
1528. Shuffle String.

You are given a string s and an integer array indices of the same length.
The string s will be shuffled such that the character at the
ith position moves to indices[i] in the shuffled string.

Return the shuffled string.
 */


public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        String s = "codeleet";
        int[ ] indices = {4, 5, 6, 7, 0, 2, 1, 3};   // Output: "leetcode"

        String ans = sol.restoreString(s, indices);
        System.out.println(ans);
    }
}

class Solution {
    public String restoreString(String s, int[] indices) {

        String[] word = new String[indices.length];
        String[] c = s.split("(?!^)");

        for (int i = 0; i < indices.length; i++) {
            word[indices[i]] = c[i];
        }

        return String.join("", word);
    }
}
