/**
 * @param {number} low
 * @param {number} high
 * @return {number[]}
 */
var sequentialDigits = function(low, high) {
    const q = [1, 2, 3, 4, 5, 6, 7, 8, 9];

    for (let i = 0; i < q.length; i++) {
        const num = q[i];
        const lastDigit = num % 10;

        if (lastDigit < 9) {
            q.push(num * 10 + lastDigit + 1);
        }
    }

    return q.filter(num => num >= low && num <= high);
};