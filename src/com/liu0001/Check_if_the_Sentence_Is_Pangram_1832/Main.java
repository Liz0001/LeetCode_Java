package com.liu0001.Check_if_the_Sentence_Is_Pangram_1832;

/*
1832. Check if the Sentence Is Pangram.

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only
lowercase English letters, return true if sentence is a pangram, or false otherwise.

 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = solution.checkIfPangram(sentence);
        System.out.println(ans);

    }
}


class Solution {
    public boolean checkIfPangram(String sentence) {

        for (int i = 97; i < 123; i++) {
//            ((char) i) + ""
            if (!sentence.contains(((char) i) + "")) {
                return false;
            }
        }
        return true;
//      return (sentence.chars().distinct().count() >= 26);
    }
}
