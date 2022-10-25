package com.liu0001.Sort_the_People_2418;

/*
2418. Sort the People.

You are given an array of strings names, and an array heights that
consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};
        String[] ans = solution.sortPeople(names,heights);
        for (String n: names) {
            System.out.println(n);
        }

    }
}


class Solution {
    public String[] sortPeople(String[] names, int[] heights) {

        Map<Integer, String> peeps = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            peeps.put(heights[i], names[i]);
        }
        heights = Arrays.stream(heights).sorted().toArray();
        int c = 0;
        for (int i = heights.length-1; i > -1; i--) {
            names[c] = peeps.get(heights[i]);
            c++;
        }
        return names;
    }
}