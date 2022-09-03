package com.liu0001.Root_Equals_Sum_of_Children_2236;

public class Solution {
    public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val);
    }
}
