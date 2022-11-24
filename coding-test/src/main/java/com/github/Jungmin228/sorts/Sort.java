package com.github.Jungmin228.sorts;

public class Sort {

    private int[] array = { 7, 3, 2, 5, 9, 4, 6, 8, 1, 10};
    private Utils utils = new Utils();

    //memo 버블 정렬
    public void bubbleSort() {
        utils.beforeSort(this.array);

        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        utils.afterSort(this.array);
    }

}
