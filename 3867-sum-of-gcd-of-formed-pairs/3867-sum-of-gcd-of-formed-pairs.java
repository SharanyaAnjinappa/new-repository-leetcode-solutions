class Solution {
    public long gcdSum(int[] nums) {
        int max=0;
        long ans=0;
        int[] prefixGcd=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            prefixGcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefixGcd);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            ans+=gcd( prefixGcd[i], prefixGcd[j]);
            i++;
            j--;
        }
        return ans;
    }
    public int gcd(int i,int j){
        while(j!=0){
            int temp=i%j;
            i=j;
            j=temp;
        }return i;
    }
}