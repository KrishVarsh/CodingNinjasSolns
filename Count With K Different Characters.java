public class Solution {
    public static int countSubStrings(String str, int k) {
        int n = str.length();
        int count = 0;

        // Iterate through all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(i, j);
                int distinctCount = countDistinctCharacters(substring);

                // Check if the substring has exactly 'k' distinct characters
                if (distinctCount == k) {
                    count++;
                }
            }
        }

        return count;
    }

    private static int countDistinctCharacters(String str) {
        boolean[] visited = new boolean[26];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!visited[ch - 'a']) {
                visited[ch - 'a'] = true;
                count++;
            }
        }

        return count;
    }}
