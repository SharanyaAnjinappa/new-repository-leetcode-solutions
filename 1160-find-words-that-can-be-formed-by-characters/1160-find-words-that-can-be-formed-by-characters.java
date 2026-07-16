class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq=new int[26];
        for(char i:chars.toCharArray()){
            freq[i-'a']++;
        }
        int ans=0;
        for(String word : words){
            int[] arr=freq.clone();
            boolean possible=true;
            for(char c:word.toCharArray()){
                arr[c-'a']--;
                if(arr[c-'a']<0){
                    possible=false;
                    break;}
            }
            if(possible){ ans+=word.length();}
        }
        return ans;
    }
}