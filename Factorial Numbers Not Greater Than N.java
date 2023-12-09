// Factorial Numbers Not Greater Than N
import java.util.*;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> output = new ArrayList<Long>();
        long fact=1, i=1;
        while(fact<=n)
        {
            output.add(fact);
            fact *= (++i);
        }
        return output;
    }
    
}
