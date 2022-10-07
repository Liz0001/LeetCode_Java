package com.liu0001.Split_a_String_in_Balanced_Strings_1221;

/*
1221. Split a String in Balanced Strings.

Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.
 */
public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int ans = solution.balancedStringSplit("RLRRLLRLRL");
        System.out.println(ans);

    }
}

class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, numL = 0, numR = 0;
        char[] chars = s.toCharArray();
        for (char c: chars) {
           if (c == 'R') {
                numR++;
            } else {
                numL++;
            }
            if (numL == numR) {
                count ++;
                numL = 0;
                numR = 0;
            }
        }
        return count;
    }
}