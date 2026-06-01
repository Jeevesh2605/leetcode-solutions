/**
 * @param {number[]} cost
 * @return {number}
 */
var minimumCost = function(cost) {
    let n = cost.length;
    cost.sort((a,b) => b-a);
    let total = 0;
    for(let i=0;i<n;i++){
        if(i%3!==2){
            total+=cost[i];
        }
    }
    return total;
};