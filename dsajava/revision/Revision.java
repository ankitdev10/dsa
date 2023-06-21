package dsajava.revision;

public class Revision {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 7, 8, 9, 1, 2, 3 };
        System.out.println(findPeakInMountainArray(nums));
    }

    static int findPeakInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
