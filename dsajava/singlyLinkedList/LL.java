package dsajava.singlyLinkedList;

public class LL {
    Node head;
    Node tail;
    int length = 0;

    class Node {
        int data;
        // ! because "next" is a varaible which stores next node so the type is given
        Node next;;

        // ? constructor for node
        Node(int data) {
            this.data = data;
        }
    }

    // insert at last
    void push(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            // yedi list empty xaina bhani aile ko tail(last node of the list) is now second
            // last tei bhayera aile ko tail ko next le newNode lai point garxa ani aaba
            // naya tail bhaneko newNode hunxa
            tail.next = newNode;
            tail = newNode;
        }
    }

    // insert at first
    void shift(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            newNode.next = head;
            head = newNode;
        }
        this.length += 1;
    }

    // remove last node

    void pop() {
        if (length == 0) {
            System.out.println("Can not pop, list is empty");
        } else {
            // aaba last node delete garna second last node samma pugam ani second last ko
            // next lai null gardim
            Node currNode = head;

            while (currNode.next != null) {
                currNode = currNode.next;
            }
        }
        length -= 1;
    }

    void printItems() {
        // print garna paila head bata suru ani hudai janxa, tei bhara euta variable
        // chaiyo of data type Node itself which will traerse through the nodes
        Node currNode = head;

        while (currNode != null) {
            System.out.println(currNode.data);
            currNode = currNode.next;
        }

    }
}
