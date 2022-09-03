package com.liu0001.Root_Equals_Sum_of_Children_2236;

/*
2236. Root Equals Sum of Children.

You are given the root of a binary tree that consists of exactly 3 nodes:
the root, its left child, and its right child.

Return true if the value of the root is equal to the sum of the values
of its two children, or false otherwise.
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        // Input: root = [10,4,6]       // Output: true
        // Input: root = [5,3,1]        // Output: false
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(5, treeNode2, treeNode3);

        boolean ans = solution.checkTree(treeNode1);
        System.out.println(ans);

    }
}
