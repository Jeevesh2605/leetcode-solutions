/**
 * @param {string} s
 * @return {string}
 */
var processStr = function(s) {
    let result = "";
    for(let ch of s){
        if(ch==='*'){
            if(result.length>0) {
                result = result.slice(0,-1);
            }
        }else if(ch==='#'){
            result+=result; //duplicate the string
        }else if(ch==='%'){
            result = result.split('').reverse().join('');
        }else{
            result +=ch;
        }
    }
    return result;
};
