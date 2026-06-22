/**
 * @param {string} text
 * @return {number}
 */
var maxNumberOfBalloons = function(text) {
    let b = 0, a = 0, l = 0, o = 0, n = 0;

    for (let c of text) {
        if (c === 'b') b++;
        else if (c === 'a') a++;
        else if (c === 'l') l++;
        else if (c === 'o') o++;
        else if (c === 'n') n++;
    }
    return Math.min(b, a, Math.floor(l / 2), Math.floor(o / 2), n);
};