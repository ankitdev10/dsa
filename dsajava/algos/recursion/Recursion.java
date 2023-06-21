package dsajava.algos.recursion;

public class Recursion {
    public static void main(String[] args) {
        Funcs func = new Funcs();
        // System.out.println(func.fib(10));

        // func.printNatural(5);
        // System.out.println(func.printSum(1234));

        // System.out.println(func.reverseString("ankit"));
        int[] nums = { 1, 2, 5, 9, 10 };
        // System.out.println(func.checkSorted(nums, 0));

        System.out.println(func.ls(nums, 0, 9));

    }
}