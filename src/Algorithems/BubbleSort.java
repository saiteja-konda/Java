package Algorithems;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 5, 3, 1, 6, 4};
        System.out.println("Unsorted Array : " + Arrays.toString(array));
        for (int i = 0, size = array.length; i < size; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println("Sorting ...: " + Arrays.toString(array));
        }
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}
