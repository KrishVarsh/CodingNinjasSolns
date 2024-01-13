import java.util.*;
public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
            xor ^= a[i];
            if (xor == b)
                count++;
            if (freqMap.containsKey(xor ^ b)) {
                count += freqMap.get(xor ^ b);
            }
            freqMap.put(xor, freqMap.getOrDefault(xor, 0) + 1);
        }
        return count;
    }

}
