class Solution1 {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        for(int i=0;i<nums.length;i++){
            int count  = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count ++;
                    if(count ==n){
                       return nums[i];
                    }
                }
            }
        }
        return -1;
    }
}


class Solution {
    public int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] || nums[i] == nums[i + 2]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
