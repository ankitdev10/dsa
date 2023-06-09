package dsajava.binarySearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(binarySearch(nums, 5));
    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middleIndex = (start + end) / 2;
            if (nums[middleIndex] == target)
                return middleIndex;
            else if (target > nums[middleIndex]) {
                start = middleIndex + 1;
                middleIndex = (start + end) / 2;
            } else {
                end = middleIndex - 1;
                middleIndex = (start + end) / 2;
            }

        }
        return -1;
    }
}
