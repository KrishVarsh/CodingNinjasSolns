import java.util.Arrays;

public class Solution {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
        // Write your code here.
        int n = a.length;
        int m = b.length;

        int left = n - 1;
        int right = 0;

        while (left >= 0 && right < m) {
            if (a[left] > b[right]) {
                long temp = b[right];
                b[right] = a[left];
                a[left] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }

        Arrays.sort(a);
        Arrays.sort(b);
    }
}
