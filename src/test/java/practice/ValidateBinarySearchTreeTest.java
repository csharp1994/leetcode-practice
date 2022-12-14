package practice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import helpers.BinaryTree;

public class ValidateBinarySearchTreeTest {

    ValidateBinarySearchTree implementation;
    BinaryTree tree;

    @Before
    public void setup() {
        implementation = new ValidateBinarySearchTree();
        tree = new BinaryTree();
    }

    @Test
    public void testIsValidSearchTree() {
        assertTrue(implementation.isValidBinarySearchTree(tree.root));
        tree.add(1);
        tree.addRight(10);
        assertTrue(implementation.isValidBinarySearchTree(tree.root));
        tree.addLeft(5);
        assertFalse(implementation.isValidBinarySearchTree(tree.root));
    }
}
