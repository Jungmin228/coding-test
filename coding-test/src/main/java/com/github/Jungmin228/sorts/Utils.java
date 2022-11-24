package com.github.Jungmin228.sorts;

public class Utils {
    public void beforeSort(int[] array) {
        System.out.println("Before Sort");
        displayArray(array);
    }

    public void afterSort(int[] array) {
        System.out.println("After Sort");
        displayArray(array);
    }

    public void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
