package com.liu0001.Maximum_Number_of_Words_Found_in_Sentences_2114;

/*
2114. Maximum Number of Words Found in Sentences.


A sentence is a list of words that are separated
by a single space with no leading or trailing spaces.

You are given an array of strings sentences,
where each sentences[i] represents a single sentence.

Return the maximum number of words that appear in a single sentence.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String[] sentences = {"c", "b"
//                "alice and bob love leetcode",
//                "i think so too",
//                "this is great thanks very much"
        };      // Output: 6
        int ans = solution.mostWordsFound(sentences);
        System.out.println(ans);

    }
}


class Solution {
    public int mostWordsFound(String[] sentences) {

        int count = 1;
        for (String s: sentences) {
            if (s.split("\\w+").length > count) {
                count = s.split("\\w+").length;
            }
        }
        return count;
    }
}