 // Increasing Letter Triangle
// A
// A B
// A B C
public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here

        for(int i=1;i<=n;i++){
            char d='A';
            for(int j=1;j<=i;j++){
                System.out.print(d+" ");
                d++;
            }
            System.out.println();
        }
    }
}
