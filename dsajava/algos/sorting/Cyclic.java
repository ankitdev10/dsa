package dsajava.algos.sorting;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 2, 1, 4 };

        for (int i = 0; i < arr.length; i++) {
            int correctIndex = Math.abs(arr[i]) - 1;
            if (arr[correctIndex] > 0) {
                arr[correctIndex] = -arr[correctIndex];
            } else {
                System.out.println(
                        "repating " + (correctIndex + 1));
            }

        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0) {
                System.out.println("The missing is " + (j + 1));
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }
}
