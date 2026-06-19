/**
 * @param {string} pattern
 * @return {string}
 */
var smallestNumber = function(pattern) {
    let n = pattern.length;
    let result="";
    const stack = [];
    let counter=1;
    for(let i=0;i<=n;i++){
        stack.push(counter++);
        if(i===n || pattern[i]==='I'){
            while(stack.length>0){
                result+=stack.pop();
            }
        }
    }
    return result;
};