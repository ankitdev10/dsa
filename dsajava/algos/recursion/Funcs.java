package dsajava.algos.recursion;

public class Funcs {

    // ! return fib
    int fib(int n) {
        if (n <= 2) {
            return 1;
        } else {

            return fib(n - 1) + fib(n - 2);
        }
    }

    // ! binary search using recursion
    int bs(int nums[], int start, int end, int target) {

        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (target == nums[mid])
            return mid;
        else if (target > nums[mid]) {
            return bs(nums, mid + 1, end, target);
        } else {
            return bs(nums, start, mid - 1, target);
        }

    }

    // ! natural numbrs from nth to 1;

    void printNatural(int n) {
        if (n == 0)
            return;
        printNatural(n - 1);
        System.out.println(n);
    }

    // ! given an integer find the sum of digits
    int printSum(int num) {

        if (num == 0)
            return 0;

        return num % 10 + printSum(num / 10);
    }

    // ! reverse a string
    String reverseString(String str) {
        int length = str.length();
        if (length == 0)
            return str;
        return (str.charAt(length - 1)) + reverseString(str.substring(0, length - 1));
    }

    // ! palindrom

}
