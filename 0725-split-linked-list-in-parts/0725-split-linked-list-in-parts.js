/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode[]}
 */
var splitListToParts = function(head, k) {
    let curr = head;
    let L = 0;

    while (curr !== null) {
        L++;
        curr = curr.next;
    }

    let eachBucketNodes = Math.floor(L / k);
    let remainderNodes = L % k;
    let result = new Array(k);

    curr = head;
    let prev = null;

    for (let i = 0; i < k; i++) {
        result[i] = curr;

        let partSize = eachBucketNodes + (remainderNodes > 0 ? 1 : 0);

        for (let count = 0; count < partSize; count++) {
            prev = curr;
            if (curr !== null) curr = curr.next;
        }

        if (prev !== null) {
            prev.next = null;
        }

        if (remainderNodes > 0) remainderNodes--;
    }

    return result;
};