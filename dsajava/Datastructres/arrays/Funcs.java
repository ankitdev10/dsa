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

    public void DNF(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // ! Find the sub array of size 'k' with largest sum
    // { 2, 9, 31, -4, 21, 7 };
    public void slidingWindow(int[] arr, int k) {
        // ? NAIVE APPRAOCH
        // int currSum = 0;
        // int maxSum = -100;
        // for (int i = 0; i < arr.length; i++) {
        // currSum = 0;
        // for (int j = i; j < i + k; j++) {
        // if (j == arr.length)
        // break;
        // currSum += arr[j];

        // }
        // maxSum = Math.max(maxSum, currSum);
        // }
        // System.out.println(maxSum);

        // ! Better approach

        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        // first sliding window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        // lets find maximum
        for (int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        System.out.println(maxSum);
    }

    // ! 53. Maximum Subarray
    public int maxSubArray(int[] nums) {
        // ? brute force solution
        // int sum = -1000;
        // for (int i = 0; i < nums.length; i++) {
        // int loopSum = 0;
        // for (int j = i; j < nums.length; j++) {
        // loopSum += nums[j];
        // sum = Math.max(loopSum, sum);
        // }
        // }
        // System.out.println(sum);
        // return sum;

        // ! KADANE'S ALGORITHM
        // first take a big negative number as a maximum value
        // loop through the array
        // get sum in increasing order(0th index, 0 - 1st index, 0 to 3rd index and so
        // on)
        // find max from current max and loop-sum
        // if the loop-sum resolves to a positive number carry sum to next interation
        // else
        // replace it with 0

        int max = Integer.MIN_VALUE;
        int loopSum = 0;

        for (int i = 0; i < nums.length; i++) {
            loopSum += nums[i];
            max = Math.max(max, loopSum);
            if (loopSum < 0) {
                loopSum = 0;
            }

        }
        System.out.println(max);
        return max;

    }

    // ! 152. Maximum Product Subarray

    public int maxProduct(int[] nums) {
        int largestProduct = nums[0];
        int minCurrentProduct = nums[0];
        int maxCurrentProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentProduct = Math.max(maxCurrentProduct * nums[i], nums[i]);

            if (minCurrentProduct * nums[i] > currentProduct)
                currentProduct = minCurrentProduct * nums[i];

            int temp = Math.min(maxCurrentProduct * nums[i], nums[i]);

            if (minCurrentProduct * nums[i] > temp)
                minCurrentProduct = temp;
            else
                minCurrentProduct = minCurrentProduct * nums[i];

            maxCurrentProduct = currentProduct;
            largestProduct = Math.max(maxCurrentProduct, largestProduct);
        }

        return largestProduct;
    }

    // ! 121. Best Time to Buy and Sell Stock

    public int maxProfit(int[] prices) {
        // two pointers
        // left to buy stock
        // / right is to sell which is left + 1, because we can only sell after we buy

        int left = 0;
        int right = 1;
        int profit = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int currProfit = prices[right] - prices[left];
                profit = Math.max(currProfit, profit);
            } else {
                left = right;
            }
            right++;
        }
        return profit;
    }

    // ! 2149 rearrange array elements by sign
    public int[] rearrangeArray(int[] nums) {
        int pos = 0; // index for positive nums
        int neg = 1; // index for negs
        int[] ans = new int[nums.length];
        for (int el : nums) {
            if (el > 0) {
                ans[pos] = el;
                pos += 2;
            } else {
                ans[neg] = el;
                neg += 2;
            }
        }
        return ans;
    }

    // PRINT ALL THE ELEMENTS THAT ARE LEADERS(tyo element ko right ma tyo bhanda
    // sano matra hunu paryos)

    void findLeader(int[] arr) {

        // brute force
        // for (int i = 0; i < arr.length; i++) {
        // boolean leader = true;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[j] > arr[i]) {
        // leader = false;
        // break;
        // }
        // }
        // if (leader == true) {
        // System.out.println(arr[i]);
        // }
        // }

        // OPTIMAL

        // last bata herdam aam,ani current element ko right ko greatest matra track
        // garam
        // yedi current element right ko greatest bhanda thulo xa bhani, that is a
        // leader ani naya max pani tei element hunxa

        int max = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                System.out.println(arr[i]);
            }
            max = Math.max(arr[i], max);

        }
    }

}
