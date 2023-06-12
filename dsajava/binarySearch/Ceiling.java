package dsajava.binarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 5, 6 };
        System.out.println(getCeil(nums, 4));
    }

    static int getCeil(int[] nums, int t) {

        int start = 0;
        int end = nums.length - 1;
        int middleIndex = 0;
        while (start <= end) {
            middleIndex = (start + end) / 2;
            int middleNum = nums[middleIndex];

            if (t > middleNum) {
                start = middleIndex + 1;
            } else if (t < middleNum) {
                end = middleIndex - 1;
            } else if (middleNum == t) {
                return nums[middleIndex];
            }
        }

        return nums[start];
    }
}
