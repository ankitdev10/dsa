package dsajava.DSA.doubly;

public class DL {
    Node head;
    Node tail;
    int length = 0;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }
    // INSERT AT LAST

    void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // aile ko tail le naya node lai point garyo
            tail.next = newNode;
            // aile ko node ko previous le aile ko tail lai point garyo
            newNode.prev = tail;
            // aaba tail bhaneko aile konaya node
            tail = newNode;
        }
        length += 1;
    }

    // insert at first

    void shift(int data) {
        Node newNode = new Node(data);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            // aile ko head ko prev le naya lai garxa
            head.prev = newNode;
            // aaba new node ko next le aile ko head lai garxa
            newNode.next = head;
            // aaba head bhaneko naya node hunxa
            head = newNode;
        }
    }

    void printItems() {
        Node currNode = head;
        if (length == 0) {
            System.out.println("The list is empty");
            return;
        }
        while (currNode != null) {
            System.out.println(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}
