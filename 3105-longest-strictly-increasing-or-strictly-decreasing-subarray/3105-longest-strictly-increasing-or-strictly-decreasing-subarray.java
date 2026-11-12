class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec=1;
        int max = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc++;
                max = Math.max(max,inc);
                dec=1;
            }
            if(nums[i]<nums[i-1]){
                dec++;
                max = Math.max(max,dec);
                inc=1;
            }
            if(nums[i]==nums[i-1]){
                inc=1;
                dec=1;
            }
        }
        return max;
    }
}