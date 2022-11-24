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

    //memo 선택 정렬
    public void selectionSort() {
        utils.beforeSort(this.array);

        for (int i = 0; i < array.length; i++) {
            int minIdx = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }

        utils.afterSort(this.array);
    }

    //memo 삽입 정렬
    public void insertionSort() {
        utils.beforeSort(this.array);

//        for (int i = 1; i < array.length; i++) {
//            int now = array[i];
//            int insertPos = i;
//
//            for (int j = i - 1; j >= 0; j--) {
//                if (array[j] < now) {
//                    break;
//                }
//                array[j+1] = array[j];
//                insertPos--;
//            }
//            array[insertPos] = now;
//        }

        for (int i = 1; i < array.length; i++) {
            int now = array[i];
            int insertPos = i - 1;

            while (insertPos >= 0 && array[insertPos] > now) {
                array[insertPos+1] = array[insertPos];
                insertPos--;
            }
            array[insertPos+1] = now;

        }

        utils.afterSort(this.array);
    }

}
