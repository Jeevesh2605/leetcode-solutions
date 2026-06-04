/**
 * @param {number} num1
 * @param {number} num2
 * @return {number}
 */
var totalWaviness = function(num1, num2) {
    let ans = 0;
    for(let i=num1;i<=num2;i++){
        const s = i.toString();
        for(let j=1;j<s.length-1;j++){
            if(
                (s[j]>s[j-1] && s[j]>s[j+1]) || 
                (s[j]<s[j-1] && s[j]<s[j+1])
            ){
                ans++;
            }
        }
    }return ans;

};