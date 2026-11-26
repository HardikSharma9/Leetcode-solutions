class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int [] result =new int[nums.length];
        // SQUARING THE ARRAY
        for(int k=0;k<nums.length;k++){
            nums[k]=nums[k]*nums[k];
        }
        //SET THEM AT RIGHT POSITION
        for(int pos=result.length-1;pos>=0;pos--){
            if(nums[j]>nums[i]){
                result[pos]=nums[j];j--;
            }
            else{
                result[pos]=nums[i];i++;
            }
            
        } return result;
       
}}