package dsajava.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL linkedList = new LL();

        linkedList.push(1);
        linkedList.push(2);
        // linkedList.push(3);
        linkedList.push(4);
        linkedList.push(5);
        // linkedList.push(6);

        linkedList.insertAtIndex(3, 2);
        linkedList.printItems();
    }
}
