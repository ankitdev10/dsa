package dsajava.Datastructres.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// ? STRIVER SDE SHEET
public class Funcs {
    // left rotate array by 1 position
    void rotateArr(int[] arr, int k) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int ones = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ones++;
                ans = ones > ans ? ones : ans;
            } else {
                ones = 0;
            }
        }
        return ans;
    }

    // ! find union in sorted array
    int[] findUnion(int[] arr1, int[] arr2) {

        Set<Integer> set = new HashSet<Integer>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            set.add(arr1[i]);
            set.add(arr2[i]);
            i++;
            j++;
        }
        int[] ans = new int[set.size()];
        int k = 0;
        for (int el : set) {

            ans[k] = el;
            k++;
        }
        return ans;
    }

    // ! find missing number in an array if array is from (1,n);
    // ! the missing number is replaced with 0

    void findMissing(int[] arr) {
        // we use cyclic sort
        int i = 0;
        int ans = 0;
        while (i < arr.length) {
            int correctIdx = arr[i] - 1;

            if (correctIdx == -1) {
                System.out.println("hehe");
                ans = i + 1;
                break;
            }

            else if (arr[i] != arr[correctIdx]) {
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;
            } else {
                i++;
            }
        }
        System.out.println(ans);
    }
}
