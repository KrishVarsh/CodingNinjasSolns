public class Solution {

    public static int numberofgasstationsrequired(double dist,int arr[]){

        int n=arr.length;

        int count=0;

        for(int i=1;i<n;i++){

            int numberinbetween=(int)((arr[i]-arr[i-1])/dist);

            if((arr[i]-arr[i-1])==(dist*numberinbetween))

            numberinbetween--;

            count+=numberinbetween;

        }

        return count;

    }

    public static double MinimiseMaxDistance(int []arr, int k){

        int n=arr.length;

        double low=0;

        double high=0;

        for(int i=0;i<n-1;i++){

            high=Math.max(high,(double)(arr[i+1]-arr[i]));

        }

        double diff=1e-6;

        while(high-low>diff){

            double mid=low+(high-low)/(2.0);

            int count=numberofgasstationsrequired(mid,arr);

            if(count>k)

            low=mid;

            else

            high=mid;

        }

        return high;

    }

}
