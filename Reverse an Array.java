// Reverse an Array
public class Solution {

    public static int[] reverseArray(int n, int []nums) {

        // Write your code here.

        if(n<=(nums.length+1)/2){

            return nums;

        }

        int temp = nums[nums.length-n];

        nums[nums.length-n] = nums[n-1];

        nums[n-1] = temp;

 

        return reverseArray(n-1, nums);

 

    }

}

