class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int l=0;
        int r=n-1;
        int index=n-1;
        while(l<=r){
            int sl=nums[l]*nums[l];
            int sr=nums[r]*nums[r];
            if(sl>sr){
                ans[index]=sl;
                l++;
            }
            else{
                ans[index]=sr;
                r--;
            }
            index--;
        } 
        return ans;
    }
}