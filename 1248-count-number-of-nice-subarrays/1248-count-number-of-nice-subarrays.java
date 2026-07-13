class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
    public int atmost(int[] n,int k){
        int count=0;
        int l=0;
        int ans=0;
        for(int r=0;r<n.length;r++){
            if(n[r]%2!=0){count++;}
            while(count>k){
                if(n[l]%2!=0){count--;}
                l++;
            }
            ans+=r-l+1;
        }return ans;
    }
}