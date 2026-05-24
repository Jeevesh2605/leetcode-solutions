/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
// var isAnagram = function(s, t) {

//     if(s.length !== t.length) {
//         return false;
//     }

//     let count = {};
//     for(let char of s) {
//         count[char] = (count[char] || 0) + 1;
//     }
//     for(let char of t) {

//         if(!count[char]) {
//             return false;
//         }
//         count[char]--;
//     }
//     return true;
// };


var isAnagram = function(s,t){
    s = s.toLowerCase();
    t = t.toLowerCase();
    s = s.replaceAll(" ","");
    t = t.replaceAll(" ","");
    if(s.length!==t.length){
        return false;
    }
    let counts = new Array(26).fill(0);
    for(let i=0;i<s.length;i++){
        counts[s.charCodeAt(i)-'a'.charCodeAt(0)]++;
    }
    for(let i=0;i<t.length;i++){
        counts[t.charCodeAt(i)-'a'.charCodeAt(0)]--;
    }
    for(let count of counts){
        if(count!==0){
            return false;
        }
    }
    return true;

}