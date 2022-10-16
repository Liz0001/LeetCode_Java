package com.liu0001.Unique_Morse_Code_Words_804;

/*
804. Unique Morse Code Words

International Morse Code defines a standard encoding where
each letter is mapped to a series of dots and dashes, as follows:

'a' maps to ".-",
'b' maps to "-...",
'c' maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:
 */

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String[] words = {"gin","zen","gig","msg"};
        String[] a = {"a"};
        int ans1 = solution.uniqueMorseRepresentations(words);
        int ans2 = solution.uniqueMorseRepresentations(a);
        System.out.println(ans1);
        System.out.println(ans2);

    }
}


class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> morseCode = new HashMap<>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...",
                "-","..-","...-",".--","-..-","-.--","--.."};
        int ascii = 97;
        for (int i = 0; i < morse.length; i++) {
            morseCode.put((char)ascii,morse[i]);
            ascii++;
        }

        String[] arr = new String[words.length];
        char[] chars;
        String oneWord = "";

        for (int i = 0; i < words.length; i++) {
            chars = words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                oneWord = oneWord + morseCode.get(chars[j]);
            }
            arr[i] = oneWord;
            oneWord = "";
        }
        return (int) Arrays.stream(arr).distinct().count();
    }
}