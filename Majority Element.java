public class Solution {
    public static int majorityElement(int []nums) {
        int ct=0,el=0;
        for(int i=0;i<nums.length;i++){
            if(ct==0){
                ct=1;
                el=nums[i];
            }
            else if(nums[i]==el) ct++;
            else ct--;
        }
        int ct1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==el) ct1++;
            
        }
        if(ct1>(nums.length/2)){
            return el;
        }
        return -1;
    }
}
