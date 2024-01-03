// Superior Elements
import java.util.*;

public class Solution {

    public static List<Integer> superiorElements(int[] a) {
        int n = a.length;
        List<Integer> ans = new ArrayList<>();

        int max = a[n - 1];
        ans.add(a[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] > max) {
                ans.add(a[i]);
                max = a[i];
            }
        }

        Collections.sort(ans); // Sort the result in ascending order

        return ans;
    }
}
