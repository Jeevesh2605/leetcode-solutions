/**
 * @param {number[]} nums
 * @return {number}
 */
var minSwaps = function(nums) {
    let n = nums.length;
    let totalOnes = nums.reduce((sum,num)=> sum+num,0);
    let i=0;
    let currentOnes=0;
    let maxCount = 0;
    for(let j=0;j<2*n;j++){
        if(nums[j%n]===1){
            currentOnes++;
        }
        if(j-i+1>totalOnes){
            currentOnes -=nums[i%n];
            i++;
        }
        maxCount = Math.max(maxCount, currentOnes);
    }
    return totalOnes - maxCount;
};