/**
 * @param {number[]} nums
 * @return {number[]}
 */
var leftRightDifference = function(nums) {
    let rightSum = 0;
    for(let num of nums){
        rightSum+=num;
    }
    let leftSum = 0;
    let result = new Array(nums.length);
    for(let i = 0;i<nums.length;i++){
        rightSum -= nums[i];
        result[i] = Math.abs(leftSum-rightSum);
        leftSum+=nums[i];
    }
    return result;
};