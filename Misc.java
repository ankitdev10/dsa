
import java.util.Arrays;

class Misc {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, };
        System.out.println(Arrays.toString(nums));
        test(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void test(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + 10;
        }
    }
}