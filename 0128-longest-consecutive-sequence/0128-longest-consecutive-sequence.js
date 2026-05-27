/**
 * @param {number[]} nums
 * @return {number}
 */


// BRUTE FORCE O(N^3)
// var longestConsecutive = function(nums) {
//     let longest = 0;
//     for(let i=0;i<nums.length;i++){
//         let currentNum = nums[i];
//         let currentStreak = 1;
//         while(true){
//             let found = false;
//             for(let j=0;j<nums.length;j++){
//                 if(nums[j]==currentNum+1){
//                     found = true;
//                     break;
//                 }
//             }
//             if(found){
//                 currentNum++;
//                 currentStreak++;
//             } else{
//                 break;
//             }
//         }
//         longest = Math.max(longest, currentStreak);
//     }
//     return longest;
// };


// USING SORTING O(nlogn)
// var longestConsecutive = function(nums) {

//     // edge case
//     if(nums.length === 0) {
//         return 0;
//     }

//     // sort array
//     nums.sort((a, b) => a - b);

//     let longest = 1;
//     let currentStreak = 1;

//     for(let i = 1; i < nums.length; i++) {
//         // skip duplicates
//         if(nums[i] === nums[i - 1]) {
//             continue;
//         }
//         // consecutive number found
//         else if(nums[i] === nums[i - 1] + 1) {
//             currentStreak++;
//         }

//         // sequence broken
//         else {
//             longest = Math.max(longest, currentStreak);
//             currentStreak = 1;
//         }
//     }
//     // final update
//     longest = Math.max(longest, currentStreak);

//     return longest;
// };


//BEST SOLUTION
var longestConsecutive = function(nums) {

    let set = new Set(nums);
    let longest = 0;

    for(let num of set) {

        // start of sequence
        if(!set.has(num - 1)) {

            let currentNum = num;
            let currentStreak = 1;

            // keep checking next numbers
            while(set.has(currentNum + 1)) {
                currentNum++;
                currentStreak++;
            }
            longest = Math.max(longest, currentStreak);
        }
    }

    return longest;
};