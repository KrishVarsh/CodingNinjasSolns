// Check Palindrome (recursive)
public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int i = 0;
        int n = str.length(); // Initialize n
        while (i < n / 2) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
