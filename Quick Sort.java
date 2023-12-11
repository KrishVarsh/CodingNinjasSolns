//Quick Sort
import java.util.* ;
import java.io.*; 
public class Solution {
    // Main quickSort method to start the sorting process
    public static List<Integer> quickSort(List<Integer> arr) {
        qs(arr, 0, arr.size() - 1); // Call the helper method
        return arr; // Return the sorted array
    }

    // Helper method to partition the array and return the pivot index
    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low); // Choose the pivot as the first element
        int i = low;
        int j = high;

        // Move elements less than or equal to the pivot to the left
        // and elements greater than the pivot to the right
        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }

            // Swap elements to maintain the partitioning
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        // Swap the pivot to its correct position
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);

        return j; // Return the pivot index
    }

    // Recursive quickSort method
    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high); // Get the pivot index
            qs(arr, low, pIndex - 1); // Recursively sort the left subarray
            qs(arr, pIndex + 1, high); // Recursively sort the right subarray
        }
    }
}
