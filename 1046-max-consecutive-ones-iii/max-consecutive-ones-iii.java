class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero_cnt=0;
        int start=0;
        int max_one=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]==0){
                zero_cnt++;
            }
            while(zero_cnt>k){
                if(nums[start]==0)zero_cnt--;
                start++;
            }
            max_one=Math.max(max_one,end-start+1);
        } return max_one;
    }
}