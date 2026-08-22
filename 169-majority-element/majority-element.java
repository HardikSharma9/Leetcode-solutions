import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
       int majority=nums[0];
       int vote=1;
       for(int i=1;i<nums.length;i++){
          if(vote==0){
            majority=nums[i];
            vote++;
          }else if(nums[i]==majority){
            vote++;
          }else{
            vote--;
          }
       }return majority;
    }
}