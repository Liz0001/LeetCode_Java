package com.liu0001.Largest_Local_Values_in_a_Matrix_2373;

/*
2373. Largest Local Values in a Matrix

You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the
3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest
value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int[][] grid = {{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int[][] ans = solution.largestLocal(grid);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length ; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}



class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] ans = new int[grid.length-2][grid.length-2];
        int num = 0;
        int[] arr;
        for (int i = 0; i < ans.length; i++) {
            arr = new int[ans.length];
            for (int j = 0; j < ans.length; j++) {
                int[] arr2 = {
                        grid[i][j], grid[i][j+1], grid[i][j+2],
                        grid[i+1][j], grid[i+1][j+1], grid[i+1][j+2],
                        grid[i+2][j], grid[i+2][j+1], grid[i+2][j+2]
                };
                num = Arrays.stream(arr2).max().getAsInt();
                arr[j] = num;
            }
            ans[i] = arr;
        }
        return ans;
    }
}