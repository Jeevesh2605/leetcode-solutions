/**
 * @param {number[]} nums
 * @return {string}
 */
var largestNumber = function(nums) {
    nums.sort((a,b)=>{
        let ab = String(a)+String(b);
        let ba = String(b)+String(a);
        if(ab>ba) return -1;
        if(ab<ba) return 1;
        return 0;
    });
    let result = nums.join('');
    return result[0]==='0'?'0':result;
};