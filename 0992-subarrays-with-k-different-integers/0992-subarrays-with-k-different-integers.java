class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public int atmost(int[] nums,int k){
        int l=0;
        int ans=0;
        int distint=0;
        int[] arr=new int[nums.length+1];
        for(int r=0;r<nums.length;r++){
            if(arr[nums[r]]++==0){distint++;}
            while(distint>k){
                if(--arr[nums[l]]==0){distint--;}
                l++;
            }
            ans+=r-l+1;
        }return ans;
    }
}


 /*   private int atMost(int[] nums, int k) {
        int[] freq = new int[nums.length + 1];
        int left = 0, distinct = 0, count = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (freq[nums[right]]++ == 0) {
                distinct++;
            }
            
            while (distinct > k) {
                if (--freq[nums[left]] == 0) {
                    distinct--;
                }
                left++;
            }
            
            count += right - left + 1;
        }
        
        return count;
    }
}*/