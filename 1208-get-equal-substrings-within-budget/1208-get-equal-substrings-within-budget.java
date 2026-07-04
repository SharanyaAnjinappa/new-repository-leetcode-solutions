class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0;
        int cost=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            cost+=Math.abs(s.charAt(r)-t.charAt(r));
            if(cost>maxCost){
                cost-=Math.abs(s.charAt(l)-t.charAt(l));
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }return ans;
    }
}