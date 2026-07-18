class Solution {
    public boolean isSubsequence(String s, String t) {
       /* int l=0;    Two Pointers
        int r=0;
        while(l<s.length() && r<t.length()){
            if(s.charAt(l)==t.charAt(r)){l++;}
            r++;
        }
        return l==s.length();*/
        for(int i=0;i<s.length();i++){
            int index=t.indexOf(s.charAt(i));
            if(index==-1){return false;}
            t=t.substring(index+1,t.length());
        }return true;
    }
}