import java.util.*;

public class Solution {

    public static int noOfCows(int[] stalls, int mid){

        int ans=1;

        int last_cow=stalls[0];

 

        for(int i=1; i<stalls.length; i++){

            if(stalls[i]-last_cow >= mid){

                ans++;

                last_cow=stalls[i];

            }

        }

        return ans;

    }

    public static int aggressiveCows(int []stalls, int k) {

        //    Write your code here.

        //Keeping distances as var

        Arrays.sort(stalls);

        int i=1;

        int j=((stalls[stalls.length-1] - stalls[0])) ;

        int min=0;

 

        while(i<=j){

            int mid=(i+j)/2;

 

            int num= noOfCows(stalls,mid);

 

            if(num>=k){

                min=mid;

                i=mid+1;

            }else{

                j=mid-1;

            }

        }

        return min;

    }

}
