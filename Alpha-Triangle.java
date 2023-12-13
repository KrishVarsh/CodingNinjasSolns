 // Alpha-Triangle
// C 
// C B 
// C B A 

public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        char ch=(char)('A'+n-1);
        for(int i=0;i<n;i++){
             for (char j = ch; j >= ch - i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
