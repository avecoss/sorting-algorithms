package dev.alexcoss.algorithms.sorting;

public class QuickSort {
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int divideIndex = partition(arr, low, high);

            sort(arr, low, divideIndex - 1);
            sort(arr, divideIndex, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int rightIndex = high;
        int leftIndex = low;

        int pivot = arr[low + (high - low) / 2];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
