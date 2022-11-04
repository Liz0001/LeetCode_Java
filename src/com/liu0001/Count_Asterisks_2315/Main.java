package com.liu0001.Count_Asterisks_2315;

/*
2315. Count Asterisks.

You are given a string s, where every two consecutive
vertical bars '|' are grouped into a pair. In other words,
the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.

Return the number of '*' in s, excluding the '*' between each pair of '|'.

Note that each '|' will belong to exactly one pair.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
//        String s = "l|*e*et|c**o|*de|";
//        String s = "iamprogrammer";
        String s = "yo|uar|e**|b|e***au|tifu|l";
        int ans = solution.countAsterisks(s);
        System.out.println(ans);

    }
}



class Solution {
    public int countAsterisks(String s) {

        int c = 0;
        int ast = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '|' && c == 1) c = 0;
            else if (s.charAt(i) == '|' && c == 0) c = 1;

            if (c == 0 && s.charAt(i) == '*') {
                ast++;
            }
        }
        return ast;
    }
}