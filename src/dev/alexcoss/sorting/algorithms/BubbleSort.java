package dev.alexcoss.sorting.algorithms;

public class BubbleSort {
    int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
