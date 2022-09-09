package com.liu0001.Goal_Parser_Interpretation_1678;

/*
1678. Goal Parser Interpretation.

You own a Goal Parser that can interpret a string command.
The command consists of an alphabet of "G", "()" and/or "(al)" in some order.
The Goal Parser will interpret "G" as the string "G", "()" as
the string "o", and "(al)" as the string "al". The interpreted strings
are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String command = "G()(al)";

        String ans = solution.interpret(command);
        System.out.println(ans);

    }
}


class Solution {
    public String interpret(String command) {

        command = command.replace("()", "o");
        command = command.replace("(al)", "al");

        return command;
    }
}