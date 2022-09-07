package com.liu0001.Find_a_Corresponding_Node_a_Binary_Tree_in_a_Clone_of_That_Tree_1379;

/*
1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree.

Given two binary trees original and cloned and given a reference to
a node target in the original tree.

The cloned tree is a copy of the original tree.

Return a reference to the same node in the cloned tree.

Note that you are not allowed to change any of the two trees or
the target node and the answer must be a reference to a node in the cloned tree.
 */

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();
        // Input: tree = [7,4,3,null,null,6,19], target = 3
        // Output: 3
        TreeNode treeNode1 = new TreeNode(7);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(19);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;
        TreeNode ans = solution.getTargetCopy(treeNode1, treeNode1, treeNode3);
        System.out.print("Node: ");
        System.out.println(ans.val);


    }

}
