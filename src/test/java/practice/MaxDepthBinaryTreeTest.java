package practice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import helpers.BinaryTree;

public class MaxDepthBinaryTreeTest {

    MaxDepthBinaryTree implementation;
    BinaryTree tree;

    @Before
    public void setup() {
        implementation = new MaxDepthBinaryTree();
        tree = new BinaryTree();
        for (int i = 0; i < 50; i++) {
            tree.add(i);
        }
    }

    @Test
    public void testGetMaxDepth() {
        assertEquals(50, implementation.getMaxDepth(tree.root));
        tree.add(12352);
        assertEquals(51, implementation.getMaxDepth(tree.root));
        tree.add(11);
        assertEquals(51, implementation.getMaxDepth(tree.root));

    }
}
