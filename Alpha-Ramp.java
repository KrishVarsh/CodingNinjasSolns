// Alpha-Ramp
public class Solution {
    public static void alphaRamp(int n) {
        // Write your code here
        char d='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(d+" ");
                
            }
            d++;
            System.out.println();
        }
    }
}
