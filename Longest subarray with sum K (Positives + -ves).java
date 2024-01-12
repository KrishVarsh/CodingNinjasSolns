import java.util.* ;
import java.io.*; 
public class Solution {
    public static int getLongestSubarray(int []nums, int k) {
/* Concept:
    --------------------------------------
    [                X                    ] // entirely x
                             [     k      ] // some part of sub array is k
    [          X-k          ][     k      ] // x-k + k = x entirely

    meaning, we would sum from 0 to i. Hence X
    but if at a point you find X == k then good. Which means subarray till hear is completely summing into k
    but we also search sub-part of array where summation could be k
        - So we check if summation from 0 to i= X
        - then if X-k exists. If it exists it means k exist as subarray somewhere betn 0 to i                             
        - so we get index of X-k's to calculate i - index[X-k] to check for longest len
*/

    int maxLen = 0;
    long prefixSum = 0;
    HashMap<Long, Integer> remainder = new HashMap<>(); 

    for(int i = 0; i < nums.length; i++){

        prefixSum += nums[i];

        // if sum from 0 to i is k
        if(prefixSum == k){
            maxLen = Math.max(maxLen, i+1); // bcz prefixsum is from 0 to i
        }
 /* X- k to calculate max subarray if exists bcz not all longest subarray can be from 0 to i 
it could also be from m to i or a to i */
        long rem = prefixSum - k; 
        if(remainder.containsKey(rem)){
            maxLen = Math.max(i-remainder.get(rem), maxLen);
        }

/* we want the remainder in a way that we find max len for k. Eg: 2 0 0 3 if we add prefixsum in hm. 
then 2 will be first 0 then 1 then 2 because 2+0=2+0=2 so 3 will be of len = 1 
but maxlen for k=3 is [0 0 3] and [2 0 0] [3]
so only store 1st occurance of prefixsum
*/
       if(!remainder.containsKey(prefixSum)){
            remainder.put(prefixSum, i);
        }
    }

    return maxLen;
    }
}
