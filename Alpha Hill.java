//     A
//   A B A
// A B C B A
// Alpha Hill
public class Solution {
    public static void alphaHill(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            char d='A';
            //sp
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //alp
            char ch='A';
            int bp=(2*i+1)/2;
            for(int j=1;j<=(2*i+1);j++){

                System.out.print(ch+ " ");
                if(j<=bp) ch++;
                else ch--;
            }
            //sp
            for(int j=0;j<=n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
        

    }
}
