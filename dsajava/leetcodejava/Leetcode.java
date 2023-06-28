package dsajava.leetcodejava;

public class Leetcode {
    public static void main(String[] args) {
    }

    // ! 88
    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    // for (int i = m, j = 0; i < m + n; i++, j++) {
    // nums1[i] = nums2[j];
    // }

    // // now sort array using insertion sort
    // for (int i = 0; i < nums1.length - 1; i++) {
    // for (int j = i + 1; j > 0; j--) {
    // if (nums1[j] < nums1[j - 1]) {
    // int temp = nums1[j];
    // nums1[j] = nums1[j - 1];
    // nums1[j - 1] = temp;
    // }

    // }
    // }

    // }
    // ! 189
    // public void rotate(int[] nums, int k) {
    // // we will reverse the entire array first
    // // then reverse the first k elements
    // // then reverse the remaining elements
    // k = k % nums.length;
    // reverse(nums, 0,nums.length - 1);
    // reverse(nums, 0, k - 1 );
    // reverse(nums, k , nums.length - 1 );

    // }

    // static void reverse(int[] nums, int startIndex, int endIndex){
    // while(startIndex < endIndex){
    // int temp = nums[startIndex];
    // nums[startIndex] = nums[endIndex];
    // nums[endIndex] = temp;
    // startIndex++;
    // endIndex--;
    // }
    // }
}
