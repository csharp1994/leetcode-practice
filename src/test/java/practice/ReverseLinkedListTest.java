package practice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import helpers.LinkedList;
import helpers.LinkedList.Node;

/**
 * Unit test for Rotate2DArray.java
 */
public class ReverseLinkedListTest {

    ReverseLinkedList implementation;
    LinkedList list;

    @Before
    public void setUp() {
        implementation = new ReverseLinkedList();
        list = new LinkedList();
        for (int i = 0; i <= 100; i++) {
            list.append(i);
        }
    }

    @Test
    public void testReverseIteratively() {
        Node result = implementation.reverseIteratively(list.head);
        int expectedValue = 100;
        while (result != null && result.next != null) {
            assertEquals(expectedValue, result.data);
            result = result.next;
            expectedValue--;
        }
    }

    @Test
    public void testReverseRecursively() {
        Node result = implementation.reverseRecursively(list.head);
        int expectedValue = 100;
        while (result != null && result.next != null) {
            assertEquals(expectedValue, result.data);
            result = result.next;
            expectedValue--;
        }
    }
}
