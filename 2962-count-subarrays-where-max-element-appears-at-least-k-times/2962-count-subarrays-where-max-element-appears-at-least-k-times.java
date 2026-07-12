class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
        }
        int l=0;
        int count=0;
        long ans=0;
        for(int r=0;r<n;r++){
            if(nums[r]==max){count++;}
            while(count>=k){
                ans+=n-r;
                if(nums[l]==max){count--;}
                l++;
            }
        }return ans;
    }
}