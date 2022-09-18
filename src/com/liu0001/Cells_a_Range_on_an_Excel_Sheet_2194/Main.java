package com.liu0001.Cells_a_Range_on_an_Excel_Sheet_2194;

/*
2194. Cells in a Range on an Excel Sheet

A cell (r, c) of an Excel sheet is represented as a string "<col><row>" where:

<col> denotes the column number c of the cell. It is represented by alphabetical letters.
For example, the 1st column is denoted by 'A', the 2nd by 'B', the 3rd by 'C', and so on.
<row> is the row number r of the cell. The rth row is represented by the integer r.
You are given a string s in the format "<col1><row1>:<col2><row2>", where <col1>
represents the column c1, <row1> represents the row r1, <col2> represents the column
c2, and <row2> represents the row r2, such that r1 <= r2 and c1 <= c2.

Return the list of cells (x, y) such that r1 <= x <= r2 and c1 <= y <= c2.
The cells should be represented as strings in the format mentioned above and
be sorted in non-decreasing order first by columns and then by rows.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution sol = new Solution();
        String s = "A1:F1";

        List<String> ans= sol.cellsInRange(s);
        System.out.println(ans);
    }
}


class Solution {
    public List<String> cellsInRange(String s) {

        List<String> ans = new ArrayList<String>();
        String[] alphabet = {"A","B","C","D","E","F","G","H",
                "I","J","K","L","M","N","O","P",
                "Q","R","S","T","U","V","W","X","Y","Z"};

        char[] chars = s.toCharArray();
        int indexStart = Arrays.asList(alphabet).indexOf(Character.toString(chars[0]));
        int indexEnd = Arrays.asList(alphabet).indexOf(Character.toString(chars[3]));
        int colStart = Integer.parseInt(String.valueOf(chars[1]));
        int colEnd = Integer.parseInt(String.valueOf(chars[4])) + 1;

        for (int i = indexStart; i < indexEnd+1; i++) {
            for (int j = colStart; j <colEnd; j++) {

                ans.add(alphabet[i] + String.valueOf(j));
            }
        }
        return ans;
    }
}