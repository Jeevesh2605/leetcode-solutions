/**
 * @param {number[]} landStartTime
 * @param {number[]} landDuration
 * @param {number[]} waterStartTime
 * @param {number[]} waterDuration
 * @return {number}
 */
var earliestFinishTime = function(landStartTime, landDuration, waterStartTime, waterDuration) {
    let minL = 3000, minW = minL, res = minW;
    const n = landStartTime.length;
    const m = waterStartTime.length;

    for (let i = 0; i < n; i++)
        minL = Math.min(minL, landStartTime[i] + landDuration[i]);

    for (let i = 0; i < m; i++) {
        minW = Math.min(minW, waterStartTime[i] + waterDuration[i]);
        res = Math.min(res, Math.max(minL, waterStartTime[i]) + waterDuration[i]);
    }

    for (let i = 0; i < n; i++)
        res = Math.min(res, Math.max(minW, landStartTime[i]) + landDuration[i]);

    return res;
    
};