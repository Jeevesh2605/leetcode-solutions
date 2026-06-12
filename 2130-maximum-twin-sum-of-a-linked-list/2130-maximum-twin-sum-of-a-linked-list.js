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
// var pairSum = function(head) {
//     let arr = [];
//     let curr = head;
//     while(curr!==null){
//         arr.push(curr.val);
//         curr = curr.next;
//     }
//     let res = 0;
//     let i=0;
//     let j=arr.length-1;
//     while(i<j){
//         res = Math.max(res,arr[i]+arr[j]);
//         i++;
//         j--;
//     }
//     return res;
// };


var pairSum = function(head){
    // find mid
    let slow = head;
    let fast = head;
    while(fast!==null && fast.next!==null){
        slow = slow.next;
        fast = fast.next.next;
    }
    let mid = slow;
    // reverse 2nd half
    let prev = null;
    let nextNode = null;
    while(mid!==null){
        nextNode = mid.next;
        mid.next = prev;
        prev = mid;
        mid = nextNode;
    }
    // find max result
    let res = 0;
    let curr = head;
    while(prev!==null){
        res = Math.max(res, curr.val + prev.val);
        curr = curr.next;
        prev = prev.next;
    }
    return res;
}