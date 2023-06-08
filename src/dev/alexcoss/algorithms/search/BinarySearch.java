package dev.alexcoss.algorithms.search;

public class BinarySearch {
    /**
     * @param array the array to be searched
     * @param key the value to be searched for
     * @return returns the element id. if it returns -1, then no such number was found in the array.
     */
    public static int search(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (key < array[mid]) {
                high = mid - 1;
            } else if (key > array[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
