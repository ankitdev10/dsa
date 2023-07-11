package dsajava.Datastructres.arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 3, 1, 1, 3, 1, 1 };
        Funcs func = new Funcs();
        System.out.println(func.majorityElement(arr));
    }

}
