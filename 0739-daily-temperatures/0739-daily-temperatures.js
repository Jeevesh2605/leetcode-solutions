/**
 * @param {number[]} temperatures
 * @return {number[]}
 */
var dailyTemperatures = function(temperatures) {
    const st = [];
    let result = [];
    let n= temperatures.length;
    for(let i = n-1;i>=0;i--){
        while(st.length!==0 && temperatures[i]>=temperatures[st[st.length-1]]){
            st.pop();
        }
        if(st.length===0){
            result[i]=0;
        } else{
            result[i] = st[st.length-1]-i;
        }
        st.push(i);
    }
    return result;
};