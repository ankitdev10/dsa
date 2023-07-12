package dsajava.Datastructres.arrays;

import java.util.Arrays;
// import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// ? STRIVER SDE SHEET
public class Funcs {
    // left rotate array by 1 position

    // helper method for other questions
    void swap(int[] arr, int swap1, int swap2) {
        int temp = arr[swap1];
        arr[swap1] = arr[swap2];
        arr[swap2] = temp;

    }

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

    // ! longest subarray with sum k

    // sliding window pattern

    void longestSubarrayWithSumK(int[] a, int k) {
        // ! bruteforce way
        // int length = 0;
        // for (int i = 0; i < a.length; i++) {
        // int s = 0;
        // for (int j = i; j < a.length; j++) {
        // s += a[j];

        // if (s == k) {
        // length = Math.max(length, j - i + 1);
        // }
        // }
        // }
        // System.out.println(length);

        // ! hashing
        int sum = 0;
        int maxLen = 0;

        HashMap<Integer, Integer> sumMap = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;

            if (sumMap.containsKey(rem)) {
                maxLen = Math.max(maxLen, i - sumMap.get(rem));
            } else {
                sumMap.put(sum, i);
            }
        }
        System.out.println(maxLen);
    }

    // ! Leetcode 75. Sort colors
    void sortZerosOnesTwos(int[] nums) {
        // ?the brute force solution will be to apply anu of the sorting techniques

        // ! better soltion
        // ? suru ma 1s, 0s, 2s kati ota xa bhanera count garam ani jati ota xa teti ota
        // rakhdai jam
        // int zeros = 0, ones = 0, twos = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 0)
        // zeros++;
        // else if (arr[i] == 1)
        // ones++;
        // else if (arr[i] == 2)
        // twos++;
        // }
        // System.out.println(zeros + " " + ones + " " + twos);
        // // jati ota ones xa teti samma index ma one haldim

        // // first ma chai zero jati ota xa, array ko aagadi aauxa
        // for (int i = 0; i < zeros; i++) {
        // arr[i] = 0;

        // }

        // // abaa 1s ones jata sakyo tya bata suru hunxa, yedi zero 3 ta thyo bhani,
        // zeros
        // // ko value 3 hunxa, array ko 0,1,2 index ma '0' hunxa ani aaba 1 suru hunxa
        // for (int i = zeros; i < zeros + ones; i++) {
        // arr[i] = 1;
        // }

        // for (int i = ones + zeros; i < arr.length; i++) {
        // arr[i] = 2;
        // }
        // System.out.println(Arrays.toString(arr));

        // ! better solution

        // ! DUTCH NATIONAL FLAG ALGORITHMS
        // we use 3 pointers, low, mid and high
        // array is divided into 4 parts, (0, low - 1),(low, mid - 1), (mid, high),
        // (high + 1, length of array - 1)

        // the first part hypothetically belongs to 0s, second belongs to 1s, 3rd is
        // UNKNOWN and the last part is for 2s

        // yedi unknown part ma 0 aauxa bhane arr[low], arr[mid] swap, low++, mid++

        // yedi unknown part ma 1 aauxa bhani mid ++

        // yedi two aauxa bhani arr[mid] arr[high] swap ani high --

        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap low and mid
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    // ! majority element in an array such that the occurence of element is more
    // than half of length of array

    // NAIVE APPROACH
    public int majorityElement(int[] v) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < v.length; i++) {
            int value = map.getOrDefault(v[i], 0);
            map.put(v[i], value + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > v.length / 2) {
                return entry.getKey();
            }

        }
        return 1;
    }
}
