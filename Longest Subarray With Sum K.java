public class Solution {
    public static int longestSubarrayWithSumK(int[] a, long k) {

        int len = 0;

        for (int i = 0; i < a.length; i++) {

            long s = 0;

            for (int j = i; j < a.length; j++) {

                s = s + (long) a[j];

                if (s == k) {

                    len = Math.max(len, j - i + 1);

                }

            }

        }

        return len;

    }
}
