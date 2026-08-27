class Solution {
    public void nextPermutation(int[] nums) {
        int pivot=-1;
        //find the pivot
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]) {
            pivot=i;
            break;}
        }
        if(pivot==-1){
            int low=0;
            int high=nums.length-1;
            while(low<=high){
                int temp=nums[low];
                nums[low]=nums[high];
                nums[high]=temp;
                low++;
                high--;
            } return;

        }
        // next larger element
        for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                  int temp=nums[i];
                  nums[i]=nums[pivot];
                  nums[pivot]=temp;
                  break;
             }}
             int k=pivot+1;
             int j=nums.length-1;
             while(k<=j){
                int temp=nums[k];
                nums[k++]=nums[j];
                nums[j--]=temp;
                
             }
        
    }
}