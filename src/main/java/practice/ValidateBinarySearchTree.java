package practice;

import helpers.TreeNode;

/**
 * Given the root of a binary tree, determine if it a valid binary search tree.
 * 
 * A valid binary search tree is defined as follows:
 * - The left subtree of a node contains only nodes with keys less than the
 * node's key
 * - The right subtree of a node contains only nodes with keys less than the
 * node's key
 * - Both the left and right subtrees must also be binary search trees
 * 
 * Example:
 * Input: root = [2,1,3]
 * Output: true
 * 
 * Constraints:
 * The number of nodes in the tree is in the range [1, 104].
 * -231 <= Node.val <= 231 - 1
 */
public class ValidateBinarySearchTree {

    /**
     * Checks for a valid BST
     * 
     * @param node
     * @return true if valid, false if invalid
     */
    public boolean isValidBinarySearchTree(TreeNode node) {

        return isValidTreeHelper(node, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
    }

    private boolean isValidTreeHelper(TreeNode node, double min, double max) {
        if (node == null) {
            return true;
        }

        if (node.val <= min || node.val >= max) {
            return false;
        }

        return isValidTreeHelper(node.left, min, node.val) && isValidTreeHelper(node.right, node.val, max);
    }
}
