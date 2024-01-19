 Square Root of a number
import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long n) {
	
        int low = 1, high = (int)n;
        //Binary search on the answers:
        while (low <= high) {
            long mid = (low + high) / 2;
            long val = mid * mid;
            if (val <= (long)(n)) {
                //eliminate the left half:
                low = (int)(mid + 1);
            } else {
                //eliminate the right half:
                high = (int)(mid - 1);
            }
        }
        return high;
    }
}
