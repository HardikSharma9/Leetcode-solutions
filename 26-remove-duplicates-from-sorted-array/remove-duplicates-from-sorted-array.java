class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int i=0;int j=0;
       while(i<nums.length-1 && j<nums.length){
        if(nums[i]==nums[j])j++;
        else{
            count++;
            nums[i+1]=nums[j];
            i++;
        }
        
       } return count;
}}