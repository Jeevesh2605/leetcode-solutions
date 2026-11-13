class Solution {
    public int minOperations(int[] nums) {
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) count++;
        }
        if(count==nums.length){
            return 0;
        }
        return 1;
    }
}