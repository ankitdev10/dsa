package dsajava.doubly;

public class Main {
    public static void main(String[] args) {
        DL doubly = new DL();

        doubly.push(1);
        doubly.push(2);
        doubly.push(3);
        doubly.push(4);
        doubly.push(5);
        doubly.push(6);

        doubly.printItems();
    }
}
