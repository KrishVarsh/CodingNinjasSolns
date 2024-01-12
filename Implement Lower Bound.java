public class Solution {
    public static int lowerBound(int []arr, int n, int x) {
        if(arr[n-1]<x){
            return n;
        }

        // Write your code here

        int ans=0;
        int l=0;
        int r=n-1;
        while(l<=r){
           int mid=(l+r)/2;
           if(arr[mid]>=x){
               ans=mid;
               r=mid-1;
           }
           else{
               l=mid+1;
           }
    }
    return ans;
}}
