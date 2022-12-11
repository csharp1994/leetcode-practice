package practice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import helpers.LinkedList;

/**
 * Unit test for PalindromeLinkedList.java
 */
public class PalindromeLinkedListTest {

    PalindromeLinkedList implmentation;
    LinkedList list;

    @Before
    public void setUp() {
        implmentation = new PalindromeLinkedList();
    }

    @Test
    public void testIsPalindromeTrue() {
        list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(2);
        list.append(1);
        assertTrue(implmentation.isPalindrome(list.head));
    }

    @Test
    public void testIsPalindromeFalse() {
        list = new LinkedList();
        for (int i = 0; i <= 100; i++) {
            list.append(i);
        }
        assertFalse(implmentation.isPalindrome(list.head));
    }

    @Test
    public void testIsPalindromeFalseLengthOne() {
        list = new LinkedList();
        list.append(123);
        assertTrue(implmentation.isPalindrome(list.head));
    }
}
