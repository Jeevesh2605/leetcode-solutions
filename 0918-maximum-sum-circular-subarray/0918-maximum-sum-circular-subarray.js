/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubarraySumCircular = function(nums) {
    const n = nums.length;
    let totalSum = 0;
    for (let num of nums) {
        totalSum += num;
    }
    const maxSum = kadanesMax(nums);
    const minSum = kadanesMin(nums);
    const circularSum = totalSum - minSum;
    if (maxSum > 0) {
        return Math.max(maxSum, circularSum);
    }

    return maxSum;
};
function kadanesMax(nums) {
    let sum = nums[0];
    let maxSum = nums[0];

    for (let i = 1; i < nums.length; i++) {
        sum = Math.max(sum + nums[i], nums[i]);
        maxSum = Math.max(maxSum, sum);
    }

    return maxSum;
}
function kadanesMin(nums) {
    let sum = nums[0];
    let minSum = nums[0];

    for (let i = 1; i < nums.length; i++) {
        sum = Math.min(sum + nums[i], nums[i]);
        minSum = Math.min(minSum, sum);
    }

    return minSum;
}