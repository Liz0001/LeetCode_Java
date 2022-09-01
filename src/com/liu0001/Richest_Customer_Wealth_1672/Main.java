package com.liu0001.Richest_Customer_Wealth_1672;

/*
You are given an m x n integer grid accounts where accounts[i][j]
is the amount of money the i^th customer has in the j^th bank.
Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts.
The richest customer is the customer that has the maximum wealth.
* */


import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};      // output: 6
        int ans = solution.maximumWealth(accounts);
        System.out.println(ans);
    }
}



class Solution {
    public int maximumWealth(int[][] accounts) {
        int nr = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (IntStream.of(accounts[i]).sum() > nr){
                nr = IntStream.of(accounts[i]).sum();
            }
        }
        return nr;
    }
}