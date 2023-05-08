package dev.alexcoss.sorting;

import dev.alexcoss.sorting.algorithms.BubbleSort;
import dev.alexcoss.sorting.algorithms.SelectionSort;

import java.util.Arrays;
import java.util.Random;

/**
 * This is a small project with various sorting algorithms such as: Bubble Sort, Selection Sort, Insertion Sort, Quick Sort, Merge Sort.
 *
 * @author alexcoss
 */
public class Launcher {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int min = 0;
        int max = 100;

        //Unsorted array
        fillArrayWithRandomNumbers(arr, min, max);
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        //Sorted array
        BubbleSort bubbleSort = new BubbleSort(arr);
        //bubbleSort.sort();

        SelectionSort selectionSort = new SelectionSort(arr);
        selectionSort.sort();
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void fillArrayWithRandomNumbers(int[] array, int min, int max) {
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int randomNumber = random.nextInt((max - min) + 1) + min;
            array[i] = randomNumber;
        }
    }
}