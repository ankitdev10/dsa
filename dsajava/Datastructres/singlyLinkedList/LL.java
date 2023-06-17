package dsajava.Datastructres.singlyLinkedList;

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

    // get node at a particular index

    void getNode(int i) {
        int currentIndex = 0;
        Node currNode = head;
        while (currentIndex != i) {
            currNode = currNode.next;
            currentIndex += 1;
        }
        System.out.println("The data at index " + i + " is " + currNode.data);
    }

    // imsert at a index

    void insertAtIndex(int data, int i) {
        Node newNode = new Node(data);
        int currIndex = 0;
        Node currNode = head;

        while (currIndex < i - 1) {
            // yedi index number 2 ma halne ho bhani aaba yo loop le previous index ko node
            // lai currNode banauxa
            currNode = currNode.next;
            currIndex += 1;
        }
        // aaba newNode chai aile ko node bhanda paxadi aauxa. paila suru nayanode le
        // aile ko node ko next point garxa
        newNode.next = currNode.next;
        // ani aile ko node ko next le aaba newnode lai point garxwa
        currNode.next = newNode;
        length += 1;
    }

    static LL merge(LL l1, LL l2) {
        Node h1 = l1.head;
        Node h2 = l2.head;
        LL ans = new LL();
        while (h1 != null && h2 != null) {

            if (h1.data < h2.data) {
                ans.push(h1.data);
                h1 = h1.next;
            } else {
                ans.push(h2.data);
                h2 = h2.next;
            }

        }

        while (h1 != null) {
            ans.push(h1.data);
            h1 = h1.next;
        }

        while (h2 != null) {
            ans.shift(h2.data);
            h2 = h2.next;
        }

        return ans;
    }

    static LL reverse(LL linkedList) {
        Node head = linkedList.head;
        Node current = head;

        LL result = new LL();

        // simply loop through the nodes and add nodes to the beginning of the list,
        // your list is reversed
        while (current != null) {
            result.shift(current.data);
            current = current.next;
        }

        return result;
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
