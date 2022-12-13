package practice;

import helpers.TreeNode;

/**
 * Given the root of a binary tree, return its maximum depth.
 * 
 * A binary tree's maximum depth is the number of nodes along the
 * longest path from the root node down to the farthest leaf node.
 * 
 * Example:
 * 
 */
public class MaxDepthBinaryTree {

    public int getMaxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        return 1 + Math.max(getMaxDepth(root.left), getMaxDepth(root.right));
    }
}
