//Remove Duplicates from Sorted Array
import java.util.*;
public class Solution {

	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
	 int count=1;

        int curr=arr.get(0);

        for(int i=1;i<n;i++){

            if(arr.get(i)!=curr){

                curr=arr.get(i);

                count++;

            }

        }

        return count;
	}
}
