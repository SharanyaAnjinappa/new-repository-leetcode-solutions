class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int i=nums[0];
        int j=nums[nums.length-1];
        while(j!=0){
            int temp=i%j;
            i=j;
            j=temp;
        }return i;
    }
}