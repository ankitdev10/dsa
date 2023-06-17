package dsajava.algos.sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static public void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int lastIndex = arr.length - i - 1;

            for (int j = 0; j < lastIndex; i++) {
                if (arr[j] > arr[lastIndex]) {

                }
            }
        }
    }

}
