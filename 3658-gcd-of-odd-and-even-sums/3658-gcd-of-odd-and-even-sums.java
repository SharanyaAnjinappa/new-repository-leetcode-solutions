class Solution {
    public int gcdOfOddEvenSums(int n) {
        int so=n*n;
        int se=n*(n+1);
        return gcd(so,se);
    }
    public int gcd(int i,int j){
        if(j==0){return i;}
        return gcd(j,i%j);
    }
}