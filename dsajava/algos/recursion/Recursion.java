package dsajava.algos.recursion;

public class Recursion {
    public static void main(String[] args) {
        // int result = fib(10);
        // System.out.println(result);

        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int ans = bs(nums, 0, nums.length - 1, 9);
        System.out.println(ans);
    }

    static int fib(int n) {

        if (n <= 2) {
            return 1;
        } else {

            return fib(n - 1) + fib(n - 2);
        }
    }

    static int bs(int nums[], int start, int end, int target) {

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
}
