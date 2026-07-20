class Solution {
    public void sortColors(int[] nums) {
       int l=0;
       int m=0;
       int h=nums.length-1;
       while(m<=h){
        if(nums[m]==0){
            int t=nums[m];
            nums[m]=nums[l];
            nums[l]=t;
            l++;
            m++;
        }
        else if(nums[m]==1){m++;}
        else{
            int t=nums[m];
            nums[m]=nums[h];
            nums[h]=t;
            h--;
        }

       }
    }
}
   /* int c0=0,c1=0,c2=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==0){c0++;}
       else if(nums[i]==1){c1++;}
       else{c2++;}
    }
    int i=0;
    while(c0-->0){nums[i++]=0;}
    while(c1-->0){nums[i++]=1;}
    while(c2-->0){nums[i++]=2;}
    }}*/
