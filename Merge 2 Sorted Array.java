// Merge 2 Sorted Array
import java.util.*;

public class Solution {

    // Function to find the union of two sorted arrays
    public static List<Integer> sortedArray(int[] a, int[] b) {

        // ArrayList to store the union of the two arrays
        ArrayList<Integer> union = new ArrayList<>();

        // Pointers for array 'a' and array 'b'
        int i = 0;
        int j = 0;

        // Length of arrays 'a' and 'b'
        int n = a.length;
        int m = b.length;

        // Merge the two sorted arrays to find the union
        while (i < n && j < m) {

            // If the current element in 'a' is less than or equal to the current element in 'b'
            if (a[i] <= b[j]) {

                // Add the current element from 'a' to the union
                addUnique(union, a[i]);

                // Move to the next element in array 'a'
                i++;

            } else {

                // Add the current element from 'b' to the union
                addUnique(union, b[j]);

                // Move to the next element in array 'b'
                j++;
            }
        }

        // Add remaining elements from array 'a' to the union
        while (i < n) {
            addUnique(union, a[i]);
            i++;
        }

        // Add remaining elements from array 'b' to the union
        while (j < m) {
            addUnique(union, b[j]);
            j++;
        }

        // Return the final union of the two arrays
        return union;
    }

    // Helper function to add unique elements to the list
    private static void addUnique(List<Integer> list, int num) {
        // If the list is empty or the last element is not equal to the current number, add it to the list
        if (list.size() == 0 || list.get(list.size() - 1) != num) {
            list.add(num);
        }
    }
}
