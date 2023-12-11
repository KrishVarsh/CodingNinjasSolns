//Largest Element in an Array
import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] a, int n) {
        // Write your code here.
        int largest=a[0];
        for(int i=0;i<n;i++){
            if(a[i]>largest)
            largest=a[i];
            
        }
        return largest;
    }
}
