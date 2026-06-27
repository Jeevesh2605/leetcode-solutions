class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int moreNeeded = target - num;

            if (map.containsKey(moreNeeded)) {
                return new int[]{map.get(moreNeeded), i};
            }

            map.put(num, i);
        }

        return new int[]{-1, -1};
    }
}

class Solution2{
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int num = nums[i];
            int moreNeeded = target-num;
            if(map.containsKey(moreNeeded)){
                return new int[]{map.get(moreNeeded),i};
            }
            map.put(num,i);
        }
        return new int[]{-1,-1};
    }
}






class Solution{
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int num = nums[i];
            int moreNeeded = target-num;
            if(map.containsKey(moreNeeded)){
                return new int[]{map.get(moreNeeded),i};
            }
            map.put(num,i);
        }
        return new int[]{-1,-1};
    }
}







