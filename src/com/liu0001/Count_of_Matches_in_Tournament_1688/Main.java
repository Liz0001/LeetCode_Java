package com.liu0001.Count_of_Matches_in_Tournament_1688;

/*
1688. Count of Matches in Tournament

You are given an integer n, the number of teams in a tournament that has strange rules:

If the current number of teams is even, each team gets paired with another team.
A total of n / 2 matches are played, and n / 2 teams advance to the next round.
If the current number of teams is odd, one team randomly advances in the tournament,
and the rest gets paired. A total of (n - 1) / 2 matches are played,
and (n - 1) / 2 + 1 teams advance to the next round.
Return the number of matches played in the tournament until a winner is decided.

 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int ans = solution.numberOfMatches(14);
        System.out.println(ans);
    }
}




class Solution {
    public int numberOfMatches(int n) {

        int matches = 0;
        while (n > 1) {
            if (n%2 == 0) {
                matches = matches + (n/2);
                n = n/2;
            } else {
                matches = matches + ((n-1)/2);
                n = ((n+1)/2);
            }
        }
        return matches;
//        return n-1;
    }
}