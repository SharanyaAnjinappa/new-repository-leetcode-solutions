class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            if(isVowel(s.charAt(r))){count++;}
            if(r>=k){
                if(isVowel(s.charAt(r-k))){count--;}
            }
            max=Math.max(max,count);
        }return max;
    } 
    public boolean isVowel(int n){
        return (n=='a'||n=='e'||n=='i'||n=='o'||n=='u');
    }
}