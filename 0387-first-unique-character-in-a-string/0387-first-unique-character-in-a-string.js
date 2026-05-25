/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    let charFreqMap = {};
    for(let i=0;i<s.length;i++){
        let char = s[i];
        charFreqMap[char] = (charFreqMap[char] || 0)+1;
    }
    for(let i=0;i<s.length;i++){
        if(charFreqMap[s[i]]==1){
            return i;
        }
    }
    return -1;

};
