package helpers;

public class LinkedList {

    public Node head;

    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Adds a new head node
     * 
     * @param data
     */
    public void push(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    /**
     * Inserts a directly node after the given node
     * 
     * @param previousNode
     * @param data
     */
    public void insert(Node previousNode, int data) {
        if (previousNode == null) {
            return;
        }

        Node newNode = new Node(data);
        newNode.next = previousNode.next;
        previousNode.next = newNode;
    }

    /**
     * Inserts a node at the end of the list
     * 
     * @param data
     */
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = new Node(data);
            return;
        }

        newNode.next = null;

        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }
}
