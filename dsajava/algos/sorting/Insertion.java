package dsajava.algos.sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            // j le chai aafno bhanda aagadi ko elements track garxa, yedi j is smaller than
            // that index then swapping occurs
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
                // System.out.println(Arrays.toString(arr));
            }
        }
    }
}
