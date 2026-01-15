class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        return sq(max(hBars), max(vBars));
    }

    private int max(int[] a){
        if(a.length == 0) return 0;
        Arrays.sort(a);
        int curr = 1, best = 1;
        for(int i = 1; i < a.length; i++){
            if(a[i] == a[i-1] + 1){
                curr++;
            } else {
                curr = 1;
            }
            best = Math.max(best, curr);
        }
        return best;
    }

    private int sq(int h, int v){
        int side = Math.min(h+1, v+1);
        return side * side;
    }
}
