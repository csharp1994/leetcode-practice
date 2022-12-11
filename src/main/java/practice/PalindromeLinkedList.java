package practice;

import java.util.Stack;

import helpers.LinkedList.Node;

/**
 * Given the head of a singly linked lsit, return true if it a palindrome or
 * false otherwise.
 * 
 * Example:
 * Input: head = [1,2,2,1]
 * Output: true
 * 
 * Constraints:
 * The number of nodes in the list is in the range [1, 105].
 * 0 <= Node.val <= 9
 */
public class PalindromeLinkedList {

    /**
     * Checks if linked list is palindrome
     * 
     * @param head
     * @return True if the linked list is a palindrome, false otherwise
     */
    public boolean isPalindrome(Node head) {
        Node slow = head;
        boolean isPalindrome = true;

        // stack is a last-in-first-out stack of objects
        Stack<Integer> stack = new Stack<Integer>();

        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }

        while (head != null) {
            int i = stack.pop();
            if (head.data == i) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
            head = head.next;
        }

        return isPalindrome;
    }

}
