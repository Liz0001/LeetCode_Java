package com.liu0001.Score_of_a_String_3110;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();

        System.out.println(sol.scoreOfString("hello"));
        System.out.println(sol.scoreOfString("zaz"));

    }
}

class Solution {
    public int scoreOfString(String s) {

        char[] chars = s.toCharArray();
        int summa = 0;

        for (int i = 1; i < chars.length; i++) {
            summa += abs(chars[i-1]-chars[i]);

        }
        return summa;
    }
}