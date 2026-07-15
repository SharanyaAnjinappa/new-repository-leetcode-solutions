class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0){return 0;}
       /* int k=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
              nums[k]=nums[i];
              k++;
            }
        }
    return k;*/
        int unique=0;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[unique]){
                unique++;
                nums[unique]=nums[i];}
        }return unique+1;
    }
}