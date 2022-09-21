package com.liu0001.Range_Sum_of_BST_938;

/*
938. Range Sum of BST

Given the root node of a binary search tree and two integers low and high,
return the sum of values of all nodes with a value in the inclusive range [low, high].
 */

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        TreeNode node9 = new TreeNode(6);
        TreeNode node8 = new TreeNode(1);
        TreeNode node7 = new TreeNode(18);
        TreeNode node6 = new TreeNode(13);
        TreeNode node5 = new TreeNode(7, node9, null);
        TreeNode node4 = new TreeNode(3, node8, null);
        TreeNode node3 = new TreeNode(15, node6, node7);
        TreeNode node2 = new TreeNode(5, node4, node5);
        TreeNode node1 = new TreeNode(10, node2, node3);

        int low = 6;
        int high = 10;
        int ans = solution.rangeSumBST(node1, low, high);
        System.out.println(ans);

    }
}
