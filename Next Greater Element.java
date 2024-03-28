import java.util.*;

public class Solution {

    public static int[] nextGreaterElement(int[] arr, int n) {

        // Write your code here.

        int ans[] = new int[n];

 

        Stack<Integer> s = new Stack<>();

        ans[n-1] = -1;

        s.push(arr[n-1]);

 

        for(int i=n-2; i>=0; i--){

            while(!s.isEmpty() && arr[i] >= s.peek()){

                s.pop();

            }

            if(s.isEmpty()){

                ans[i] = -1;

            }else{

                ans[i] = s.peek();    

            }

            s.push(arr[i]);              

        }

        return ans;

    }

}
