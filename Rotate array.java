// Rotate array
import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
                int j=0;

        while(j<=k-1){

            int temp = arr.get(0);

            for(int i =0;i<arr.size();i++){

                if(i == arr.size()-1){

                   arr.set(i, temp);

                }else{

                      arr.set(i, arr.get(i+1));

                }

            }

            j++;

        }

        return arr;
    }
}

OR
class Solution {
    public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
}

public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}
}
