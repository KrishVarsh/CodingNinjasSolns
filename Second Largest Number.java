 // Second Largest Number
public class Solution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        int large1 = Integer.MIN_VALUE;

        // Find the largest element in the array
        for (int i = 0; i < a.length; i++) {
            if (a[i] > large1) {
                large1 = a[i];
            }
        }

        int large2 = Integer.MIN_VALUE;

        // Find the second largest element excluding duplicates
        for (int i = 0; i < a.length; i++) {
            if ((a[i] > large2) && (a[i] != large1)) {
                large2 = a[i];
            }
        }

        int small1 = Integer.MAX_VALUE;

        // Find the smallest element in the array
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= small1) {
                small1 = a[i];
            }
        }

        int small2 = Integer.MAX_VALUE;

        // Find the second smallest element excluding duplicates
        for (int i = 0; i < a.length; i++) {
            if ((a[i] <= small2) && (a[i] != small1)) {
                small2 = a[i];
            }
        }

        // Create an array to store the second largest and second smallest elements
        int[] arr = {large2, small2};

        return arr;
    }
}

