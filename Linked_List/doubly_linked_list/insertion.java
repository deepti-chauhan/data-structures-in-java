package DLL;

public class doubly_linked_list {

    static Node head;

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

    public void addFirst(int data) {
        Node newNode = new Node(data); // initialise the new Node

        newNode.next = head;
        newNode.prev = null;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode; // new Node is our head now.
    }

    public void addLast(int data) {

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

    public void addAfterNode(Node prevNode, int data) {
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

    public void addBeforeNode(Node nextNode, int data) {
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

    public void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        doubly_linked_list myList = new doubly_linked_list();
        myList.addFirst(1);                         // 1->null
        myList.addLast(10);                         // 1->10->null    
        myList.addAfterNode(head, 2);               // 1->10->2->null
        muList.addBeforeNode(head.next, 3);         // 1->3->2->10->null
        myList.printList(head);
    }
}


// output : 1->3->2->10
