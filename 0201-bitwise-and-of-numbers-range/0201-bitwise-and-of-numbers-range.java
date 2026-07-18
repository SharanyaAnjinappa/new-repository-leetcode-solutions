class Solution {
    public int rangeBitwiseAnd(int l, int r) {
        /*int shift=0;
        while(l!=r){
            l>>=1;
            r>>=1;
            shift++;
        }return l<<shift;*/
        while (r > l) {
            r = r & (r - 1);
        }

        return r;
    }
}