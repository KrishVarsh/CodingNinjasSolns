// Increasing Number Triangle
public class Solution {
    public static void nNumberTriangle(int n) {
        int d=1;
        // Write your code here
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(d+" ");
                d++;
            }
            System.out.println();
        }
    }
}
