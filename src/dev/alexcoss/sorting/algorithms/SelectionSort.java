package dev.alexcoss.sorting.algorithms;

public class SelectionSort {
    int[] array;

    public SelectionSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        int position, temp;
        for (int i = 0; i < array.length; i++) {
            position = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[position])
                    position = j;
            }
            temp = array[i];
            array[i] = array[position];
            array[position] = temp;
        }
    }
}
