package dsajava.DSA.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL L1 = new LL();
        LL l2 = new LL();

        L1.push(1);
        L1.push(3);
        L1.push(5);
        L1.push(7);
        L1.push(9);

        l2.push(2);
        l2.push(4);
        l2.push(6);
        l2.push(8);
        l2.push(10);

        LL ans = LL.merge(L1, l2);

        ans.printItems();

    }
}
