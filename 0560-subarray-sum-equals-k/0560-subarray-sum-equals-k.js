var subarraySum = function(nums, k) {
    const sumCountMap = new Map();

    sumCountMap.set(0, 1);

    let result = 0;
    let prefixSum = 0;

    for (let num of nums) {
        prefixSum += num;

        if (sumCountMap.has(prefixSum - k)) {
            result += sumCountMap.get(prefixSum - k);
        }

        sumCountMap.set(
            prefixSum,
            (sumCountMap.get(prefixSum) || 0) + 1
        );
    }

    return result;
};