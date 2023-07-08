package dsajava.Datastructres.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 4, 3, 0 };
        int[] arr2 = new int[] { 2, 4, 6, 8 };
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        Funcs func = new Funcs();
        func.longestSubarrayWithSumK(nums, 15);
    }

}
