package com.liu0001.Check_If_Two_String_Arrays_are_Equivalent_1662;

/*
1662. Check If Two String Arrays are Equivalent
Given two string arrays word1 and word2, return true
if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements
concatenated in order forms the string.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};
        boolean ans = solution.arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }
}


class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String sen1 = "", sen2 = "";

        for (int i = 0; i < word1.length; i++) {
            sen1 = sen1 + word1[i];
        }
        for (int i = 0; i < word2.length; i++) {
            sen2 = sen2 + word2[i];
        }
        return sen1.equals(sen2);
    }
}