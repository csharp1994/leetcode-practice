package helpers;

public class BinaryTree {

    public TreeNode root;

    /**
     * Adds value to tree in sorted position.
     * 
     * @param value
     */
    public void add(int value) {
        root = addNode(root, value);
    }

    public void addLeft(int value) {
        root = addLeftHelper(root, value);
    }

    public void addRight(int value) {
        root = addRightHelper(root, value);
    }

    private TreeNode addNode(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.val) {
            current.left = addNode(current.left, value);
        } else if (value > current.val) {
            current.right = addNode(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    private TreeNode addLeftHelper(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        } else {
            current.left = addLeftHelper(current.left, value);
        }

        return current;
    }

    private TreeNode addRightHelper(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        } else {
            current.right = addRightHelper(current.right, value);
        }

        return current;
    }
}
