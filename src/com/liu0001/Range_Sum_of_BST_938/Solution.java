package com.liu0001.Range_Sum_of_BST_938;

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {

        int sum = 0, left = 0, right = 0;

        if (root == null) {
            return 0;
        }

        if (root.val >= low && root.val <= high) {
            sum = root.val;
        }

        if (root.val > low) {
            left = rangeSumBST(root.left, low, high);
        }

        if (root.val < high) {
            right = rangeSumBST(root.right, low, high);
        }

        return sum + left + right;
    }
}