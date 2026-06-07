/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let n = nums.length;
    let result = [];
    for(let i=0;i<n;i++){
        result[0]=1;
        result[i] = result[i-1]*nums[i-1];
    }
    let right_product = 1;
    for(let i=n-1;i>=0;i--){
        result[i] = result[i]*right_product;
        right_product *= nums[i];
    }
    return result;
};