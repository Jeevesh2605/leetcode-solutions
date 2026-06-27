/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let n = nums.length;
    const result = new Array(n);
    let pi=0, ni=1;
    for(let num of nums){
        if(num>0){
            result[pi] = num;
            pi+=2;
        }else{
            result[ni] = num;
            ni+=2;
        }
    }
    return result;

};