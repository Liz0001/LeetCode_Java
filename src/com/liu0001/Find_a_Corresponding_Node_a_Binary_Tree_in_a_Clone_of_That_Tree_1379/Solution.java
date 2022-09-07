package com.liu0001.Find_a_Corresponding_Node_a_Binary_Tree_in_a_Clone_of_That_Tree_1379;

public class Solution {

    public final TreeNode getTargetCopy(final TreeNode original,
                                        final TreeNode cloned,
                                        final TreeNode target) {

        if (original == null) {
            return null;
        }

        if (original == target) {
            return cloned;
        }
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left == null) {
            return getTargetCopy(original.right, cloned.right, target);
        } else {
            return left;
        }
    }

}
