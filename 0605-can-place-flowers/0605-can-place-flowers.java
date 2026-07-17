class Solution {//fb=flowerbed
    public boolean canPlaceFlowers(int[] fb, int n) {
        if(n==0){return true;}
        int len=fb.length;
        int cnt=0;
        if(len==1){return ((n==1) && fb[0]==0);}
        if(fb[0]==0 && fb[1]==0){
            fb[0]=1;
            cnt++;
        }
        if(fb[len-1]==0 && fb[len-2]==0){
            fb[len-1]=1;
            cnt++;
        }
        for(int i=1;i<len-1;i++){
            if(fb[i]==1){continue;}
            if(fb[i-1]==0 && fb[i+1]==0){
                fb[i]=1;
                cnt++;
            }
        }return cnt>=n;
    }
}