class Solution {
    public int mirrorDistance(int n) {
        int reverse=0;
        for( int i=n;i>0;i/=10){
            reverse=10*reverse+i%10;
        }
        return Math.abs(reverse-n);
        
    }
}