 Rotated Triangle
public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=1;i<=2*n-1;i++){
            
            int star=i;
            if(i>n) 
            //upper
            //lower
            star=2*n-i;
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
