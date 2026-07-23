class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int[] ans=new int[nums.length];
        int i=0;
        while(l<=r){
            if(nums[i]%2==0){
                ans[l]=nums[i];
                l++;
            }
            else{
                ans[r]=nums[i];
                r--;
            }
            i++;
        }
        return ans;
    }                                           
}