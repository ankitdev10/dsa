package dsajava.leetcodejava.cyclicsort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 0, 1 };
        System.out.println(missingNumber(arr));
    }

    // ! leetcode 268
    static int missingNumber(int[] nums) {
        // cyclic sort
        // paila suru sort garam numbers. since its is [0,n], index ra index ma bhako
        // numbers same hunxa, like [0,1,2,3,4,5], the element at index 1 is 1 at index
        // 2 is 2 and so on

        // sorting algo
        int i = 0;
        int n = nums.length;
        while (i < n) {
            int correctIndex = nums[i];
            System.out.println("ci " + correctIndex);

            if (correctIndex < n && nums[i] != nums[correctIndex]) {
                // aaba yedi current element chai nth element haina bhani swap garam
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int j = 0; j < nums.length; j++) {
            // System.out.println("hehehe");
            if (nums[j] != j) {
                return j;
            }
        }
        // yedi hamro input bhaneko [0,1] ho bhani hamro complete array bhaneko [0,1,2]
        // hunxa, sorted ra check garne mathi ko le garxa ani final check bhaneko chai
        // if length of the array is missing than return length of the array
        return nums.length;
    }
}
