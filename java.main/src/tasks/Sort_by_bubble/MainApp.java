package tasks.Sort_by_bubble;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] arr = {9,1,8,2,7,3,6,4,5};
        System.out.println("Starting array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("\nSorted array: " + Arrays.toString(arr));



    }
    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }
}
