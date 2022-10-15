package com.liu0001.Maximum_Nesting_Depth_of_the_Parentheses_1614;

/*
1614. Maximum Nesting Depth of the Parentheses

A string is a valid parentheses string (denoted VPS) if it meets one of the following:

It is an empty string "", or a single character not equal to "(" or ")",
It can be written as AB (A concatenated with B), where A and B are VPS's, or
It can be written as (A), where A is a VPS.
We can similarly define the nesting depth depth(S) of any VPS S as follows:

depth("") = 0
depth(C) = 0, where C is a string with a single character not equal to "(" or ")".
depth(A + B) = max(depth(A), depth(B)), where A and B are VPS's.
depth("(" + A + ")") = 1 + depth(A), where A is a VPS.
For example, "", "()()", and "()(()())" are VPS's
(with nesting depths 0, 1, and 2), and ")(" and "(()" are not VPS's.

Given a VPS represented as string s, return the nesting depth of s.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
//        String s = "(1+(2*3)+((8)/4))+1";
        String s = "(1)+((2))+(((3)))";
        int ans = solution.maxDepth(s);
        System.out.println(ans);
    }
}


class Solution {
    public int maxDepth(String s) {
        int open = 0, max = 0;
        char[] chars = s.toCharArray();
        for (char c :chars) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open > max) {
                    max = open;
                }
                open--;
            }
        }
        return max;
    }
}