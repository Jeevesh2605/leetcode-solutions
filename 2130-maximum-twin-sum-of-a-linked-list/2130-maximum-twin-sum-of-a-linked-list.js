/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number}
 */
var pairSum = function(head) {
    let arr = [];
    let curr = head;
    while(curr!==null){
        arr.push(curr.val);
        curr = curr.next;
    }
    let res = 0;
    let i=0;
    let j=arr.length-1;
    while(i<j){
        res = Math.max(res,arr[i]+arr[j]);
        i++;
        j--;
    }
    return res;
};