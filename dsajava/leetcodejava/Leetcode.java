package dsajava.leetcodejava;

public class Leetcode {
    public static void main(String[] args) {

    }

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
}
