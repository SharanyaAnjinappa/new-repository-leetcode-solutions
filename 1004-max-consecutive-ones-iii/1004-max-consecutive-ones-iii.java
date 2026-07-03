class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int maxlen=0;
        int zero_count=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){zero_count++;}
            while(zero_count>k){
                if(nums[l]==0){zero_count--;}
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }return maxlen;
    }
}