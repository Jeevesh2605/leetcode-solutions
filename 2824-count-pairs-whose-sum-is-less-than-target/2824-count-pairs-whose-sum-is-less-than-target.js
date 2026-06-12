/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
// var countPairs = function(nums, target) {
//     let res = 0;
//     for(let i=0;i<nums.length;i++){
//         for(let j=i+1;j<nums.length;j++){
//             if(nums[i]+nums[j]<target){
//                 res++;
//             }
//         }
//     }
//     return res;
// };


var countPairs = function(nums,target){
    let res = 0;
    nums.sort((a,b)=> a-b);
    let l=0;
    let r = nums.length-1;
    while(l!==r){
        if(nums[l]+nums[r]<target){
            res+=r-l;
            l++;
        }else{
            r--;
        }
    }
    return res;
}