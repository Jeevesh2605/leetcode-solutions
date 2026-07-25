// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;

//         for(int i=0;i<n;i++){
//             if(nums[i]==nums[i+1]){
//                 return nums[i];
//             }
//         }
//        return -1;
//     }
// }

// class Solution{
//     public int findDuplicate(int[] nums){
//         HashSet<Integer> set = new HashSet<>();
//         for(int num:nums){
//             if(set.contains(num)){
//                 return num;
//             }
//             set.add(num);
//         }
//         return -1;
//     }
// }


class Solution{
    public int findDuplicate(int[] nums){
        int slow=0, fast=0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);
        slow=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;
    }
}