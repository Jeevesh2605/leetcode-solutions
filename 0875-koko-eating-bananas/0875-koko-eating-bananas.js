/**
 * @param {number[]} piles
 * @param {number} h
 * @return {number}
 */
var minEatingSpeed = function(piles, h) {
    let minSpeed = 1;
    let maxSpeed = Math.max(...piles);

    while (minSpeed < maxSpeed) {
        let mid = Math.floor(minSpeed + (maxSpeed - minSpeed) / 2);

        if (canEat(piles, h, mid)) {
            maxSpeed = mid;
        } else {
            minSpeed = mid + 1;
        }
    }

    return minSpeed;
};

function canEat(piles, h, speed) {
    let hours = 0;

    for (let pile of piles) {
        hours += Math.ceil(pile / speed);
    }

    return hours <= h;
}