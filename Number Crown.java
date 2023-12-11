//Number Crown
// 1         1
// 1 2     2 1
// 1 2 3 3 2 1
public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        int space=2*(n-1);
        for(int i=1;i<=n;i++){
            //no
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            //sp
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //no
            for(int j=i;j>=1;j--){
                System.out.print(j+ " ");
            }
            System.out.println();
            space-=2;
        }
        
    }
}
