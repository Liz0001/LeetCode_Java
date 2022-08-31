package com.liu0001.Final_Value_of_Variable_After_Performing_Operations_2011;

/*
2011. Final Value of Variable After Performing Operations from Leetcode.

There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations,
return the final value of X after performing all the operations.
 */


public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String[] operations = {"++X", "++X", "X++"};        // output: 3

        int ans = solution.finalValueAfterOperations(operations);
        System.out.println(ans);
    }
}


class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int ans = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("+")) {
                ans +=1;
            } else {
                ans -= 1;
            }
        }

        return ans;
    }
}
