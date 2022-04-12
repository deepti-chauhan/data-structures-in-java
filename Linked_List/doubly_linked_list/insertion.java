public class doubly_linked_list {

    Node head;

    class Node { // Node class
        int data;
        Node next;
        Node prev;

        Node(int data) { // constructor of Node class
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    /*------------------insertion operation------------------*/
    /*
     * -> addFirst
     * -> addLast
     * -> addAfterNode
     * -> addBeforeNode
     */

    void addFirst(int data) {
        Node newNode = new Node(data); // initialise the new Node

        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode; // new Node is our head now.
    }

    void addLast(int data) {

        Node newNode = new Node(data);

        newNode.next = null;

        if (head == null) {
            head = newNode;
            newNode.prev = null;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.prev = currNode;
    }

    void addAfterNode(Node prevNode, int data) {
        Node newNode = new Node(data);

        if (prevNode == null) {
            System.out.print("Error : previous node in this case cannot be null");
        }

        newNode.next = prevNode.next;
        newNode.prev = prevNode;
        prevNode.next = newNode;

        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }

    }

    void addBeforeNode(Node nextNode, int data) {
        Node newNode = new Node(data);

        if (nextNode == null) {
            System.out.println("Error : next node cannot be null");
        }

        newNode.prev = nextNode.prev;
        newNode.next = nextNode;
        nextNode.prev = newNode;

        if (newNode.prev != null) {
            newNode.prev.next = newNode;
        }
    }

}
