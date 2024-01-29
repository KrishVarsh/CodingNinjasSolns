import java.util.*;

public class Solution {

    public static String sortByFrequency(int n, String s) {

        char[] storage = new char[256];

        for (int i = 0; i < s.length(); i++) {
            storage[s.charAt(i)]++;
        }

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < 256; i++) {
            while (storage[i] > 0) {
                sb.append((char) i);
                storage[i]--;
            }
        }

        return sb.toString();
    }
}
