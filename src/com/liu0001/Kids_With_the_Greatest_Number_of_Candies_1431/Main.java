package com.liu0001.Kids_With_the_Greatest_Number_of_Candies_1431;

/*
1431. Kids With the Greatest Number of Candies.

There are n kids with candies. You are given an integer array candies,
where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies, they will have the greatest
number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
 */


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
//        int[] candies = {2, 3, 5, 1, 3};
//        int extraCandies = 3;       // Output: [true,true,true,false,true]

        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;       // Output: [true,false,false,false,false]
        List<Boolean> ans = solution.kidsWithCandies(candies, extraCandies);
        for (boolean a : ans) {
            System.out.println(a);
        }
    }
}


class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>(candies.length);
        boolean res = true;
        for (int i = 0; i < candies.length; i++) {
            for (int j = 0; j < candies.length; j++) {
                if (i != j && (candies[i] + extraCandies) < candies[j]) {
                    res = false;
                }
            }
            ans.add(res);
            res = true;
        }

        return ans;
    }
}