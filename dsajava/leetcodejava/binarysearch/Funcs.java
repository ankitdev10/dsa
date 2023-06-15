package dsajava.leetcodejava.binarysearch;

public class Funcs {
    // ! leet code 744
    // static char getChar(char[] letters, char target) {
    // int start = 0;
    // int end = letters.length - 1;
    // int mid = 0;
    // if (target >= letters[letters.length - 1])
    // return letters[0];
    // while (start <= end) {
    // mid = (start + end) / 2;
    // if (target < letters[mid]) {
    // end = mid - 1;
    // } else {
    // start = mid + 1;
    // }

    // }
    // return letters[start % letters.length];
    // }
    // ! 34
    static int check(int[] nums, int target, boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // possible answer
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    // ! 852 MEDIUM
    // ? NAIVE SOLUTION
    // int peakIndexInMountainArray(int[] arr) {
    // int ans = 0;
    // for (int i = 0; i < arr.length - 2; i++) {
    // if (arr[i + 1] > arr[i] && arr[i + 1] > arr[i + 2]) {
    // ans = i + 1;
    // }
    // }
    // return ans;
    // }

    // ? USING BINARY SEARCH

    public int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // you are in decreasing part of the array
                // mid could be possible answer but look at left because left could be greater
                // than mid
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
        // int start = 0;
        // int end = arr.length - 1;
        // int ans = 0;
        // while (start <= end) {
        // int mid = (start + end) / 2;

        // if (arr[mid] > arr[mid + 1]) {
        // // if its true it means we are now in increasing order. so now start is mid;

        // if (arr[mid] > arr[mid - 1]) {
        // ans = arr[mid];
        // return ans;
        // } else {
        // end = mid - 1;
        // }
        // } else {
        // start = mid + 1;
        // }
        // }
        // return ans;
        // }
    }

}
