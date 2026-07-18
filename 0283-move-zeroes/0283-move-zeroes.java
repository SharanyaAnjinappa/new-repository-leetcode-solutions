class Solution {
    public void moveZeroes(int[] nums) {
       /* int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }*/
        int l=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=0){
                nums[l++]=nums[r];
            }
        }
         while(l<nums.length){
                nums[l++]=0;
            }
    }
}