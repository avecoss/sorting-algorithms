package dev.alexcoss.algorithms;

import dev.alexcoss.algorithms.search.BinarySearch;
import dev.alexcoss.algorithms.sorting.*;

import java.util.Arrays;
import java.util.Random;

/**
 * This is a small project with various sorting algorithms such as: Bubble Sort, Selection Sort, Insertion Sort, Quick Sort, Merge Sort.
 * And Binary search algorithm
 *
 * @author alexcoss
 */
public class Launcher {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int min = -10;
        int max = 30;

        // Fill array
        fillArrayWithRandomNumbers(arr, min, max);
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        // Sorting
        BubbleSort.sort(arr);
        SelectionSort.sort(arr);
        InsertionSort.sort(arr);
        MergeSort.sort(arr);
        QuickSort.sort(arr);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Binary search (must be sorted)
        System.out.println("id: " + BinarySearch.search(arr, 20));
    }

    private static void fillArrayWithRandomNumbers(int[] array, int min, int max) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            array[i] = randomNumber;
        }
    }
}
