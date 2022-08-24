package com.liu0001.Merge_Two_Sorted_Lists_21;

/*
20. Valid Parentheses from Leetcode.

Given a string s containing just the characters '(', ')', '{', '}',
'[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
*/

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "()[]{}";
//        String s = "{}}";
        boolean ans = solution.isValid(s);
        System.out.println(ans);

    }
}


