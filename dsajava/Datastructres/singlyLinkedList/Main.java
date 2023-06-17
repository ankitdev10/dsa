package dsajava.Datastructres.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL L1 = new LL();

        L1.push(1);
        L1.push(3);
        L1.push(5);
        L1.push(7);
        L1.push(9);

        LL ans = LL.reverse(L1);

        ans.printItems();

    }
}
