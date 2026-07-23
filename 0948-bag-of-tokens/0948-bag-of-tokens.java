class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score=0;
        int l=0;
        int r=tokens.length-1;
        int maxscore=0;
        Arrays.sort(tokens);
        while(l<=r){
            if(power>=tokens[l]){
                power-=tokens[l];
                score++;
                maxscore=Math.max(maxscore,score);
                l++;
            }
            else if(score>0){
                power+=tokens[r];
                score--;
                r--;
            }
            else{break;}
        }return maxscore;
    }
}