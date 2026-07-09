/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    if(!strs || strs.length===0) return "";
    let prefix  = strs[0];
    for(let i=0;i<strs.length;i++){
        while(!strs[i].startsWith(prefix)){
            prefix = prefix.substring(0, prefix.length-1);
            if(prefix ==="") return "";
        }
    }
    return prefix;
};