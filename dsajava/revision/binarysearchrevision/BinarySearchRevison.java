package dsajava.revision.binarysearchrevision;

public class BinarySearchRevison {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 7, 11, 15, 21 };
        // System.out.println(binarySeach(nums, 16));
        System.out.println(ceiling(nums, 12));
    }

    static int binarySeach(int[] nums, int t) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int midIndex = (start + end) / 2;

            if (t > nums[midIndex]) {
                start = midIndex + 1;
            } else if (t < nums[midIndex]) {
                end = midIndex = 1;
            } else {
                return midIndex;
            }

        }
        return -1;
    }

    static int ceiling(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int midIndex = 0;
        while (start <= end) {
            midIndex = (start + end) / 2;
            if (target == nums[midIndex]) {
                return nums[midIndex];
            } else if (target > nums[midIndex]) {
                start = midIndex + 1;
            } else if (target < nums[midIndex]) {
                end = midIndex - 1;
            }
        }

        return nums[start];
    }
}
