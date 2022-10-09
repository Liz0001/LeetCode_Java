package com.liu0001.Decode_the_Message_2325;

/*
2325. Decode the Message

You are given the strings key and message, which represent a cipher key
and a secret message, respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as
the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least
one instance of each letter in the alphabet), we have the partial substitution
table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String ans = sol.decodeMessage(key, message);
        System.out.println(ans);    // "this is a secret"

    }
}


class Solution {
    public String decodeMessage(String key, String message) {
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                             "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        char[] chars = key.toCharArray();
        int c = 0;
        String ans = "";
        Map<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ' && !map.containsKey(chars[i])){
                map.put(chars[i], alphabet[c]);
                c++;
            }
        }
        char[] messages = message.toCharArray();
        for (char m : messages) {
            if (m == ' ') {
                ans += " ";
            }
            else {
                ans += map.get(m);
            }
        }

        return ans;
    }
}