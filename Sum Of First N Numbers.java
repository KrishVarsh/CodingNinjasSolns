// Sum Of First N Numbers
public class Solution {
    public static long sumFirstN(long n) {
        // Write your code here.
        if(n<=0) return n;
        return n+sumFirstN(n-1);
        
    }
}
