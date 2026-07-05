class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        for(int num:nums){
            if(set.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(set.contains(num+1)){
                    currentNum++;
                    currentStreak++;
                }
                longest = Math.max(currentStreak,longest);
            }
        }
        return longest;
    }
}