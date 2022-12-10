package practice;

import helpers.LinkedList.Node;

/**
 * Given the head of singly linked list, reverse the list, and return the
 * reversed list.
 * 
 * Uses a custom LinkedList implementation.
 * 
 * Example:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 */
public class ReverseLinkedList {

    /**
     * Iterative implementation of reversing a linked list
     * 
     * @param head First node of a linked list
     * @return The head node of the reversed list
     */
    public Node reverseIteratively(Node head) {

        Node previousNode = null;
        Node currentNode = head;
        Node nextNode = null;

        while (currentNode != null) {
            // store next node, if this is null then we're in the final loop
            nextNode = currentNode.next;
            // reverse the direction of the link
            currentNode.next = previousNode;
            // move previous and current one step forward in the list
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }

    /**
     * Recursive implmentation of reversing a linked list
     * 
     * @param head First node of a linked list
     * @return The head node of the reversed list
     */
    public Node reverseRecursively(Node head) {
        Node first;

        // identifies if the second to last node has been reached
        if (head == null || head.next == null) {
            return head;
        }

        // steps through the list until the second to last node
        first = reverseRecursively(head.next);

        // set the second to last element as the next of the last element
        head.next.next = head;
        // set the next pointer of the second last element to
        head.next = null;

        return first;
    }
}
