/**
 * @param {string} s
 * @return {string}
 */

const isVowel = (letter) => {
    return new Set(['a','e','i','o','u','A','E','I','O','U']).has(letter);
};

var reverseVowels = function(s) {
    let arr = s.split("");
    let i = 0;
    let j = arr.length - 1;

    while (i < j) {
        if (!isVowel(arr[i])) {
            i++;
        } else if (!isVowel(arr[j])) {
            j--;
        } else {
            [arr[i], arr[j]] = [arr[j], arr[i]];
            i++;
            j--;
        }
    }

    return arr.join("");
};