package com.liu0001.Sorting_the_Sentence_1859;

/*
1859. Sorting the Sentence

A sentence is a list of words that are separated
by a single space with no leading or trailing spaces.
Each word consists of lowercase and uppercase English letters.

A sentence can be shuffled by appending the 1-indexed
word position to each word then rearranging the words in the sentence.

For example, the sentence "This is a sentence" can be
shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
Given a shuffled sentence s containing no more than 9 words,
reconstruct and return the original sentence.
 */

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        String s = "is2 sentence4 This1 a3";
        String ans = sol.sortSentence(s);
        System.out.println(ans);

    }
}

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] sentence = new String[words.length];
        int wordIndex;
        char val;
        String word = "";
        for (int i = 0; i < words.length; i++){
            word = words[i];
            val = word.charAt(word.length()-1);
            wordIndex = Character.getNumericValue(val)-1;
            word = word.substring(0, word.length()-1);
            sentence[wordIndex] = word;
        }

        return String.join(" ", sentence);
    }
}