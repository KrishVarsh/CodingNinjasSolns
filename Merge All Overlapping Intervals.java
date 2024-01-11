// Problem arrays are already sorted
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> mergeOverlappingIntervals(int[][] arr) {
        List<List<Integer>> r = new ArrayList<>();
        int l1 = arr[0][0];
        int r1 = arr[0][1];

        for (int i = 0; i < arr.length; i++) {
            int l2 = arr[i][0];
            int r2 = arr[i][1];

            if (r1 >= l2 && r1 <= r2) {
                r1 = r2;
            } else if (l2 > r1) {
                List<Integer> t = Arrays.asList(l1, r1);
                r.add(t);
                l1 = l2;
                r1 = r2;
            }
        }
        r.add(Arrays.asList(l1, r1));
        return r;
    }
}
