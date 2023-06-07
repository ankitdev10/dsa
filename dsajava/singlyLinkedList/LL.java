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
        this.length += 1;
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
        if (this.length == 0) {
            System.out.println("Can not pop, list is empty");
        }
        // yedi euta matra node xa bhani
        else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            // aaba last node delete garna second last node samma pugam ani second last ko
            // next lai null gardim
            Node currNode = head;

            while (currNode.next.next != null) {
                currNode = currNode.next;
            }
            // while loop sakida aaba currNode le second last node point garxa, last nodee
            // nikalne bhanesi aaba ko last node yei node hunxa so that shoud be the tail
            // ani tesko next null hunxa
            currNode.next = null;
            tail = currNode;
        }
        length -= 1;
    }

    // remove from first;

    void unshift() {
        if (length == 0) {
            System.out.println("Can not remove node from an empty list");
        } else {

            Node crrHead = head;
            head = crrHead.next;
        }

        length -= 1;
    }

    void printItems() {
        // print garna paila head bata suru ani hudai janxa, tei bhara euta variable
        // chaiyo of data type Node itself which will traerse through the nodes

        if (length == 0) {
            System.out.println("The list is empty");
        }
        Node currNode = head;

        while (currNode != null) {
            System.out.println(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");

    }
}
