package com.liu0001.Merge_Two_Sorted_Lists_21;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        char b = '.';

        for (char c : s.toCharArray()) {
            if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '(') {
                stack.push(')');


            } else if (((c == ')') || (c == ']') || (c == '}')) && stack.isEmpty()) {
                return false;

            } else if (c == '}') {
                b = stack.pop();
                if (b != c) {
                    return false;
                }

            } else if (c == ']') {
                b = stack.pop();
                if (b != c) {
                    return false;
                }

            } else if (c == ')') {
                b = stack.pop();
                if (b != c) {
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

}
