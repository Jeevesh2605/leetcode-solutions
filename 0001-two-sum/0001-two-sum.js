/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
// var twoSum = function(nums, target) {
//     let left = 0;
//     let right = nums.length - 1;

//     while (left < right) {
//         let sum = nums[left] + nums[right];

//         if (sum === target) {
//             return [left, right];
//         } else if (sum < target) {
//             left++;
//         } else {
//             right--;
//         }
//     }

//     return [];
// };



var twoSum = function(nums,target){
    const map = new Map();
    for(let i=0;i<nums.length;i++){
        const diff = target - nums[i];
        if(map.has(diff)){
            return [map.get(diff),i];
        }
        map.set(nums[i],i);
    }
    return [];
}